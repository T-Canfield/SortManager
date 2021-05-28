package com.sparta.tom.sortmanager.sorter;

import com.sparta.tom.sortmanager.printer.Printer;
import com.sparta.tom.sortmanager.timer.Timer;

public class BubbleSorter implements Sorter {

    @Override
    public int[] sortArray(int[] arrayToSort) throws NullPointerException {
        if (arrayToSort == null) {
            throw new NullPointerException("Array to sort cannot be null");
        }
        long startTime = Timer.startTimer();
        int lengthOfArray = arrayToSort.length;
        int temporary;
        if (arrayToSort.length == 1) {
            return arrayToSort;
        }
        int swapCounter;
        for (int j = 0; j < lengthOfArray; j++) {
            swapCounter=0;
            for (int k = 1; k < (lengthOfArray); k++) {
                if (arrayToSort[k - 1] > arrayToSort[k]) {
                    temporary = arrayToSort[k - 1];
                    arrayToSort[k - 1] = arrayToSort[k];
                    arrayToSort[k] = temporary;
                    swapCounter+=1;
                }
            }
            if (swapCounter==0){
                break;
            }
        }
        long endTime = Timer.endTimer();
        Printer.printTimer(Timer.calculateTimeTaken(startTime,endTime));
        return arrayToSort;
    }
}