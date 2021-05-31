package com.sparta.tom.sortmanager.performancetesting;

import com.sparta.tom.sortmanager.binarytree.BinaryTree;
import com.sparta.tom.sortmanager.binarytree.BinaryTreeImplementation;
import com.sparta.tom.sortmanager.printer.Printer;
import com.sparta.tom.sortmanager.sorter.BubbleSorter;
import com.sparta.tom.sortmanager.sorter.MergeSorter;
import com.sparta.tom.sortmanager.sorter.Sorter;
import com.sparta.tom.sortmanager.timer.Timer;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SorterPerformanceTesting {
    @Test
    public void performanceTestingWith100ElementsASC() {
        Printer.printMessage("-----With 100 Elements-----");
        List<Integer> inputList = new ArrayList<>();
        BinaryTree binaryTree = new BinaryTreeImplementation();
        int[] input = new int[100];
        while (inputList.size() < 100) {
            int number = (int) (Math.random() * (50000 + 50000) - 50000);
            int repeatCheck = 0;

            for (int i = 0; i < inputList.size(); i++) {
                if (number == inputList.get(i)) {
                    repeatCheck = 1;
                    break;
                }
            }
            if (repeatCheck == 0) {
                inputList.add(number);
            }

            int i = 0;
            for (int element :
                    inputList) {
                input[i++] = element;
            }
        }
        Sorter bubbleSorter = new BubbleSorter();
        Sorter mergeSorter = new MergeSorter();
        BinaryTree binarytree = new BinaryTreeImplementation();
        System.out.println("For Bubble Sort");
        bubbleSorter.sortArray(input);
        System.out.println("For Merge Sort");
        mergeSorter.sortArray(input);
        System.out.println("For Binary Sort");
        long startTimer = Timer.startTimer();
        binaryTree.addElements(input);
        binaryTree.getSortedTreeAsc();
        long endTimer = Timer.startTimer();
        Printer.printTimer(Timer.calculateTimeTaken(startTimer,endTimer));
    }

    @Test
    public void performanceTestingWith1000ElementsASC() {
        Printer.printMessage("-----With 1000 Elements-----");
        List<Integer> inputList = new ArrayList<>();
        BinaryTree binaryTree = new BinaryTreeImplementation();
        int[] input = new int[1000];
        while (inputList.size() < 1000) {
            int number = (int) (Math.random() * (50000 + 50000) - 50000);
            int repeatCheck = 0;

            for (int i = 0; i < inputList.size(); i++) {
                if (number == inputList.get(i)) {
                    repeatCheck = 1;
                    break;
                }
            }
            if (repeatCheck == 0) {
                inputList.add(number);
            }

            int i = 0;
            for (int element :
                    inputList) {
                input[i++] = element;
            }
        }
        Sorter bubbleSorter = new BubbleSorter();
        Sorter mergeSorter = new MergeSorter();
        BinaryTree binarytree = new BinaryTreeImplementation();
        System.out.println("For Bubble Sort");
        bubbleSorter.sortArray(input);
        System.out.println("For Merge Sort");
        mergeSorter.sortArray(input);
        System.out.println("For Binary Sort");
        long startTimer = Timer.startTimer();
        binaryTree.addElements(input);
        binaryTree.getSortedTreeAsc();
        long endTimer = Timer.startTimer();
        Printer.printTimer(Timer.calculateTimeTaken(startTimer,endTimer));
    }
    @Test
    public void performanceTestingWith10000ElementsASC() {
        Printer.printMessage("-----With 10000 Elements-----");
        List<Integer> inputList = new ArrayList<>();
        BinaryTree binaryTree = new BinaryTreeImplementation();
        int[] input = new int[10000];
        while (inputList.size() < 10000) {
            int number = (int) (Math.random() * (50000 + 50000) - 50000);
            int repeatCheck = 0;

            for (int i = 0; i < inputList.size(); i++) {
                if (number == inputList.get(i)) {
                    repeatCheck = 1;
                    break;
                }
            }
            if (repeatCheck == 0) {
                inputList.add(number);
            }

            int i = 0;
            for (int element :
                    inputList) {
                input[i++] = element;
            }
        }
        int[] inputCopy= Arrays.copyOf(input,10000);
        Sorter bubbleSorter = new BubbleSorter();
        Sorter mergeSorter = new MergeSorter();
        BinaryTree binarytree = new BinaryTreeImplementation();
        System.out.println("For Bubble Sort");
        bubbleSorter.sortArray(input);
        System.out.println("For Merge Sort");
        mergeSorter.sortArray(input);
        System.out.println("For Binary Sort");
        long startTimer = Timer.startTimer();
        binaryTree.addElements(inputCopy);
        binaryTree.getSortedTreeAsc();
        long endTimer = Timer.startTimer();
        Printer.printTimer(Timer.calculateTimeTaken(startTimer,endTimer));
    }


}
