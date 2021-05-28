package com.sparta.tom.sortmanager.printer;

public class Printer {

    public static void printMessage(String message){
        System.out.println(message);
    }
    public static void printTimer(double timeTaken){
        System.out.println("Time taken to execute sort is: " + timeTaken + "ms");
    }
}
