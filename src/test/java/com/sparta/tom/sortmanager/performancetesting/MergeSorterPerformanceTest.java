package com.sparta.tom.sortmanager.performancetesting;

import com.sparta.tom.sortmanager.sorter.BubbleSorter;
import com.sparta.tom.sortmanager.sorter.Sorter;
import com.sparta.tom.sortmanager.timer.Timer;
import org.junit.jupiter.api.Test;

public class MergeSorterPerformanceTest {
    @Test
    public void performanceTestingWith100Elements(){
        int[] input= new int[100];
        for(int i=0;i< input.length;i++){
            input[i]=((int)Math.random()*(100000)-50000);
        }
        Sorter sorter = new BubbleSorter();
        long startTime = Timer.startTimer();
        sorter.sortArray(input);
        long endTime = Timer.endTimer();
        Timer.calculateTimeTaken(startTime,endTime);
    }
    @Test
    public void performanceTestingWith1000Elements(){
        int[] input= new int[1000];
        Sorter sorter = new BubbleSorter();
        for(int i=0;i< input.length;i++){
            input[i]=((int)Math.random()*(100000)-50000);
        }
        long startTime = Timer.startTimer();
        sorter.sortArray(input);
        long endTime = Timer.endTimer();
        Timer.calculateTimeTaken(startTime,endTime);
    }
    @Test
    public void performanceTestingWith10000Elements(){
        int[] input= new int[10000];
        Sorter sorter = new BubbleSorter();
        for(int i=0;i< input.length;i++){
            input[i]=((int)Math.random()*(100000)-50000);
        }
        long startTime = Timer.startTimer();
        sorter.sortArray(input);
        long endTime = Timer.endTimer();
        Timer.calculateTimeTaken(startTime,endTime);
    }
}
