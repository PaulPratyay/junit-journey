package com.gurudev;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Maximum & Minimum number in an Array")
class MaxMinInArrayTest {

    private MaxMinInArray maxMinInArray;

    @BeforeEach
    void setUp() {
        maxMinInArray = new MaxMinInArray();
    }

    @DisplayName("Test for finding the maximum and minimum number in an Array")
    @Test
    void findMaxMinInArrayTest() {

        int[] list = {54, 35, 87, 12, 98, 34, 65, 63, 31, 56, 87, 56};

        int maxNumber = maxMinInArray.findMaxInArray(list);
        int minNumber = maxMinInArray.findMinInArray(list);

        assertEquals(98, maxNumber);
        assertEquals(12, minNumber);

    }

}