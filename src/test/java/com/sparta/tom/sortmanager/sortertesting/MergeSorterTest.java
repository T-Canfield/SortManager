package com.sparta.tom.sortmanager.sortertesting;

import com.sparta.tom.sortmanager.sorter.MergeSorter;
import com.sparta.tom.sortmanager.sorter.Sorter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeSorterTest {
    static Sorter sorter= new MergeSorter();
    @Test
    public void shouldThrowNullPointerException(){
        Assertions.assertThrows(NullPointerException.class,()->sorter.sortArray(null));
    }
    @Test
    public void shouldReturnNumber(){

        int[] input={10};
        Assertions.assertArrayEquals(input,sorter.sortArray(input));
    }
    @Test
    public void shouldReturnSortedArray(){
        int[] input={-5,20,3,-7,1,0,17};
        int[] output={-7,-5,0,1,3,17,20};
        Assertions.assertArrayEquals(output,sorter.sortArray(input));
    }
}
