package com.sparta.tom.sortmanager.sorter;

public class SorterFactory {
    public static Sorter createSorter(int sorterNumber) throws IllegalArgumentException {
        Sorter sorter;


        if (sorterNumber == 1) {
            sorter = new BubbleSorter();
        } else if (sorterNumber == 2) {
            sorter = new MergeSorter();
        } else if (sorterNumber == 3) {
            sorter = new BinarySorter();
        }else {
            throw new IllegalArgumentException("Unexpected number for Sorter: " + sorterNumber);
        }
        return sorter;
    }
}
