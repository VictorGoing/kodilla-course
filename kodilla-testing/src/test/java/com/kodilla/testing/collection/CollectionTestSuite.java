package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("Test Odd Numbers Exterminator EmptyList")
    @Test
    void testOddNumbersExterminatorEmptyList(){
        List<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator object = new OddNumbersExterminator();

        Assertions.assertArrayEquals(new Integer[]{}, object.exterminate(numbers).toArray());
    }
    @DisplayName("Test Odd Numbers Exterminator Normal List")
    @Test
    void testOddNumbersExterminatorNormalList(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        OddNumbersExterminator object = new OddNumbersExterminator();
        int lenght = object.exterminate(numbers).size();


        Integer[] table = object.exterminate(numbers).toArray(new Integer[lenght]);
        Assertions.assertArrayEquals(new Integer[] {2,4,6},table);
    }
}