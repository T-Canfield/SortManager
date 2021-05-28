package com.sparta.tom.sortmanager.performancetesting;


import com.sparta.tom.sortmanager.printer.Printer;
import com.sparta.tom.sortmanager.sorter.BubbleSorter;
import com.sparta.tom.sortmanager.sorter.Sorter;
import com.sparta.tom.sortmanager.timer.Timer;
import org.junit.jupiter.api.Test;

public class BubbleSorterPerformanceTest {
    @Test
    public void performanceTestingWith100Elements(){
        int[] input= new int[100];
        for(int i=0;i< input.length;i++){
            input[i]=((int)(Math.random()*(100000)-50000));
        }
        Sorter sorter = new BubbleSorter();
        sorter.sortArray(input);
    }
    @Test
    public void performanceTestingWith1000Elements(){
        int[] input= new int[1000];
        Sorter sorter = new BubbleSorter();
        for(int i=0;i< input.length;i++){
            input[i]=((int)(Math.random()*(100000)-50000));
        }
        sorter.sortArray(input);
    }
    @Test
    public void performanceTestingWith10000Elements(){
        int[] input= new int[10000];
        Sorter sorter = new BubbleSorter();
        for(int i=0;i< input.length;i++){
            input[i]=((int)(Math.random()*(100000)-50000));
        }
        sorter.sortArray(input);

    }
}
