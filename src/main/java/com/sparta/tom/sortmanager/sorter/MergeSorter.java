package com.sparta.tom.sortmanager.sorter;


import com.sparta.tom.sortmanager.printer.Printer;
import com.sparta.tom.sortmanager.timer.Timer;

public class MergeSorter implements Sorter {
    private static int[] split(int[] arrayToSplit) throws NullPointerException{
        if (arrayToSplit==null){throw new NullPointerException("Array to sort cannot be null");}
        if (arrayToSplit.length==1){return arrayToSplit;}
        int targetArrayLength;
        int[] array1;
        int[] array2;

        if (arrayToSplit.length % 2 == 0) {
            targetArrayLength = (arrayToSplit.length) / 2;
            array1 = new int[targetArrayLength];
            array2 = new int[targetArrayLength];
        } else {
            targetArrayLength = (arrayToSplit.length + 1) / 2;
            array1 = new int[targetArrayLength];
            array2 = new int[(targetArrayLength - 1)];
        }
        for (int i = 0; i < arrayToSplit.length; i++) {
            if (i < array1.length) {
                array1[i] = arrayToSplit[i];
            } else if (i >= array1.length) {
                array2[(i - array1.length)] = arrayToSplit[i];
            }
        }
        if (array1.length != 1) {
            array1 = MergeSorter.split(array1);
        }
        if (array2.length != 1) {
            array2 = MergeSorter.split(array2);
        }


        return merge(array1, array2);
    }

    private static int[] merge(int[] array1, int[] array2) {
        int[] outputArray = new int[(array1.length + array2.length)];
        int j = 0;
        int k = 0;
        for (int i = 0; i < outputArray.length; i++) {
            if (j < array1.length && k < array2.length) {
                if (array1[j] < array2[k]) {
                    outputArray[i] = array1[j++];
                } else {
                    outputArray[i] = array2[k++];
                }

            } else if (k == array2.length) {
                outputArray[i] = array1[j++];
            } else {
                outputArray[i] = array2[k++];
            }
        }
        return outputArray;
    }

    @Override
    public int[] sortArray(int[] arrayToSort) {
        long startTime=Timer.startTimer();
        int[] sortedArray = split(arrayToSort);
        long endTime= Timer.endTimer();
        Printer.printTimer(Timer.calculateTimeTaken(startTime,endTime));
        return sortedArray;
    }
}


