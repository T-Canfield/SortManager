 package com.sparta.tom.sortmanager.sortertesting;

import com.sparta.tom.sortmanager.sorter.SorterFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

    public class SorterFactoryTest {
        @Test
        public void shouldThrowIllegalArgumentException(){
           Assertions.assertThrows(IllegalArgumentException.class,()-> SorterFactory.createSorter(0));
        }
    }

