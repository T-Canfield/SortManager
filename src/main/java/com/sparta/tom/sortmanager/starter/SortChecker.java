package com.sparta.tom.sortmanager.starter;

import com.sparta.tom.sortmanager.printer.Printer;

import java.util.Arrays;

public class SortChecker {
    public static boolean isSorted(int[] array,int desiredSorterType) {
        int sortCheck = 0;
        for (int i = 0; i < (array.length - 1); i++) {
            if (array[i] <= array[i + 1]) {

            } else {
                sortCheck = 1;
                break;
            }
        }
        if (sortCheck == 0 && array.length != 1 && desiredSorterType!=3) {
            Printer.printMessage("The Array is already sorted in Ascending order");
            Printer.printMessage(Arrays.toString(array));
            return true;
        } else if (array.length == 1) {
            Printer.printMessage("Cannot sort single element array");
            Printer.printMessage(Arrays.toString(array));
            return true;
        }
        return false;
    }
}
