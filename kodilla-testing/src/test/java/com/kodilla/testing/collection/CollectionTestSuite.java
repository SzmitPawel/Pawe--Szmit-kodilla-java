package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {

    @BeforeEach
    void before (){
        System.out.println("Test Case: begin");
    }

    @AfterEach
    void after (){
        System.out.println("Test Case: end");
    }

    @DisplayName("when create OddNumberExterminator with empty ArrayList " +
                 "then exterminate should return empty List")
    @Test
    void testOddNumbersExterminatorEmptyList() {

        // given
        List<Integer> actual = new ArrayList<>();
        List<Integer> expectedResult = new ArrayList<>();
        List<Integer> result;

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //when
        System.out.println("Testing: " + expectedResult);
        result = oddNumbersExterminator.exterminate(actual);

        // then
        Assertions.assertEquals(result, expectedResult);
    }

    @DisplayName("when create OddNumberExterminator with ArrayList " +
                 "then exterminate should return List contains even numbers")
    @Test
    void testOddNumbersExterminatorNormalList(){
        // given
        List<Integer> actual = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<Integer> expectedResult = new ArrayList<>(Arrays.asList(2,4,6,8,10));
        List<Integer> result;

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        // when
        result = oddNumbersExterminator.exterminate(actual);
        System.out.println("Testing: " + expectedResult);

        // then
        Assertions.assertEquals(expectedResult, result);
    }
}