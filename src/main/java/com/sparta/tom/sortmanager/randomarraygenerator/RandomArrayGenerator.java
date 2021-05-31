package com.sparta.tom.sortmanager.randomarraygenerator;

public class RandomArrayGenerator {
    public static int[] generateRandomArray(){
        int max=20000;
        int min=3;
        int[] outputArray= new int[(int) (Math.random()*(max-min)+min)];
        int i=0;
        max=50000;
        min=-50000;
        for (int element:
             outputArray) {
            outputArray[i++]=(int) (Math.random()*(max-min)+min);
        }
        return outputArray;
    }
}
