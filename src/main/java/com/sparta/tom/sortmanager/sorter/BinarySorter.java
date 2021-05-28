package com.sparta.tom.sortmanager.sorter;

import com.sparta.tom.sortmanager.binarytree.BinaryTree;
import com.sparta.tom.sortmanager.binarytree.BinaryTreeImplementation;
import com.sparta.tom.sortmanager.printer.Printer;
import com.sparta.tom.sortmanager.starter.UserInput;
import com.sparta.tom.sortmanager.timer.Timer;

public class BinarySorter implements Sorter{

    BinaryTree binaryTree =new BinaryTreeImplementation();

    public int[] sortArrayDesc(int[] arrayToSort){
        int[] output;
        binaryTree.addElements(arrayToSort);
        output=binaryTree.getSortedTreeDesc();
        return output;
    }
    public int[] sortArrayAsc(int[] arrayToSort){
        int[] output;
        binaryTree.addElements(arrayToSort);
        output=binaryTree.getSortedTreeAsc();
        return output;
    }

    @Override
    public int[] sortArray(int[] arrayToSort) throws IllegalArgumentException,NullPointerException {
        if(arrayToSort==null){throw new NullPointerException("Array to sort cannot be null");}
        int sortOrder =UserInput.getAscendingOrDescending();
       int[] output;
       long startTime=Timer.startTimer();
        if (sortOrder==1){
         output=sortArrayAsc(arrayToSort);
        }
        else if (sortOrder==2){
         output=sortArrayDesc(arrayToSort);
        }
        else{throw new IllegalArgumentException("Invalid Number For Sort Order Entered");}
        long endTime=Timer.endTimer();
        Printer.printTimer(Timer.calculateTimeTaken(startTime,endTime));
        return output;

    }
}
