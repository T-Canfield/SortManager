package com.sparta.tom.sortmanager.performancetesting;

import com.sparta.tom.sortmanager.binarytree.BinaryTree;
import com.sparta.tom.sortmanager.binarytree.BinaryTreeImplementation;
import com.sparta.tom.sortmanager.printer.Printer;
import com.sparta.tom.sortmanager.sorter.BinarySorter;
import com.sparta.tom.sortmanager.sorter.Sorter;
import com.sparta.tom.sortmanager.timer.Timer;
import org.junit.jupiter.api.Test;

public class BinarySorterPerformanceTest {
    @Test
    public void performanceTestingWith100ElementsDESC(){
        BinaryTree binaryTree= new BinaryTreeImplementation();
        while(binaryTree.getNumberOfElements()<100){
            binaryTree.addElement((int) (Math.random()*(50000+50000)-50000));
        }
        long startTime = Timer.startTimer();
        binaryTree.getSortedTreeDesc();
        long endTime = Timer.endTimer();
        Printer.printTimer(Timer.calculateTimeTaken(startTime,endTime));
    }

    @Test
    public void performanceTestingWith1000ElementsDESC(){
        BinaryTree binaryTree= new BinaryTreeImplementation();
        while(binaryTree.getNumberOfElements()<1000){
            binaryTree.addElement((int) (Math.random()*(50000+50000)-50000));
        }
        long startTime = Timer.startTimer();
        binaryTree.getSortedTreeDesc();
        long endTime = Timer.endTimer();
        Printer.printTimer(Timer.calculateTimeTaken(startTime,endTime));
    }
    @Test
    public void performanceTestingWith10000ElementsDESC(){
        BinaryTree binaryTree= new BinaryTreeImplementation();
        while(binaryTree.getNumberOfElements()<10000){
            binaryTree.addElement((int) (Math.random()*(50000+50000)-50000));
        }
        long startTime = Timer.startTimer();
        binaryTree.getSortedTreeDesc();
        long endTime = Timer.endTimer();
        Printer.printTimer(Timer.calculateTimeTaken(startTime,endTime));
    }

}
