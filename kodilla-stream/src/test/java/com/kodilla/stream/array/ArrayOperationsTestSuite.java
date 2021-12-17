package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage(){
        int[] numbers = new int[] {2,4,6,8};


        Assertions.assertEquals( 5,ArrayOperations.getAverage(numbers));

    }
}
