package com.sparta.tom.sortmanager.sortertesting;
import com.sparta.tom.sortmanager.sorter.BinarySorter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySorterTest {

    @Test
    public void shouldReturnNumberFromAsc() {
        BinarySorter sorter= new BinarySorter();
        int[] output = {50};
        int[] input = {50};
        Assertions.assertArrayEquals(output,sorter.sortArrayAsc(input));
    }

    @Test
    public void shouldReturnNumberFromDesc(){
        BinarySorter sorter2= new BinarySorter();
        int[] output={-7};
        int[] input={-7};
        Assertions.assertArrayEquals(output,sorter2.sortArrayDesc(input));
    }

    @Test
    public void shouldReturnSortedArrayAsc(){
        BinarySorter sorter= new BinarySorter();
        int[] input={-5,20,3,-7,1,0,17};
        int[] output={-7,-5,0,1,3,17,20};
        Assertions.assertArrayEquals(output,sorter.sortArrayAsc(input));
    }


    @Test
    public void shouldReturnSortedArrayDesc(){
        BinarySorter sorter= new BinarySorter();
        int[] input={-5,20,3,-7,1,0,17};
        int[] output={20,17,3,1,0,-5,-7};
        Assertions.assertArrayEquals(output,sorter.sortArrayDesc(input));
    }

    @Test
    public void shouldThrowNullPointerException(){
        BinarySorter sorter= new BinarySorter();
        Assertions.assertThrows(NullPointerException.class,()->sorter.sortArray(null));
    }

}
