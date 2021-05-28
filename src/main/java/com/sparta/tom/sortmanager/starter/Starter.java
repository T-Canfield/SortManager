package com.sparta.tom.sortmanager.starter;
import com.sparta.tom.sortmanager.printer.Printer;
import com.sparta.tom.sortmanager.sorter.*;

import java.util.Arrays;

import static com.sparta.tom.sortmanager.starter.Main.logger;

public class Starter {
    public static void start() {
        Sorter sorter = null;
        int desiredSorterType = UserInput.getSortType();
        try {
            SorterFactory sorterFactory=new SorterFactory();
            sorter=sorterFactory.createSorter(desiredSorterType);


            int[] array = UserInput.getArrayToSort();
            Printer.printMessage("Array to sort is: " +Arrays.toString(array));

            if (SortChecker.isSorted(array,desiredSorterType)==true){
            }
            else {
                if (desiredSorterType == 1) {
                    Printer.printMessage("Bubble Sort will be used");
                } else if (desiredSorterType == 2) {
                    Printer.printMessage("Merge Sort will be used");
                } else if (desiredSorterType == 3) {
                    Printer.printMessage("Binary Tree Sort will be used");
                }
               Printer.printMessage(Arrays.toString(sorter.sortArray(array)));
            }
        } catch (NullPointerException e) {
            logger.error(e.getMessage(),e);
        } catch (IllegalArgumentException e) {
            logger.error(e.getMessage(),e);
        } catch (Exception e) {
            logger.error(e);
        }

    }
}
