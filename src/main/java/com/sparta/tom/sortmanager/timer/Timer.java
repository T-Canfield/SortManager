package com.sparta.tom.sortmanager.timer;

public class Timer {
    public static long startTimer(){
        return System.nanoTime();
    }

    public static long endTimer(){
        return System.nanoTime();
    }

    public static double calculateTimeTaken(long startTime,long endTime){
        double timeTaken=(endTime-startTime)/1000000;
        return timeTaken;
    }
}
