package com.sparta.tom.sortmanager.starter;

import com.sparta.tom.sortmanager.randomarraygenerator.RandomArrayGenerator;

import java.util.Scanner;

public class UserInput {
    static Scanner userInput = new Scanner(System.in);

    public static int getSortType() {
        System.out.println("Enter the number of the sorter you would like to use:" +
                "\n1. Bubble Sort \n2. Merge Sort\n3. Binary Tree Sort");
        int output = userInput.nextInt();
        return output;
    }

    public static int[] getArrayToSort() throws IllegalArgumentException {
        System.out.println("Enter the number of elements in the array (enter 0 for a random Array)");
        int arraySize = userInput.nextInt();
        int i=0;
        int[] output;
        if (arraySize == 0) {
            output = RandomArrayGenerator.generateRandomArray();
        } else if(arraySize>0) {
            output = new int[arraySize];
            for (int element :
                    output) {
                System.out.println("Enter the value of the element");
                element = userInput.nextInt();
                output[i++]=element;
            }
        }
        else{throw new IllegalArgumentException("Array size cannot be negative");}
        return output;
    }
    public static int getAscendingOrDescending(){
        System.out.println("Enter 1 for ascending or 2 for Descending");
        return userInput.nextInt();
    }
}
