package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        // given
        int[] arrayInt = new int[10];

        for (var i = 0; i < 10; i++) {
            arrayInt[i] = i + 5;
        }
        // when
        double resultAverage = ArrayOperations.getAverage(arrayInt);

        // then
        Assertions.assertEquals(9.5, resultAverage);
    }
}
