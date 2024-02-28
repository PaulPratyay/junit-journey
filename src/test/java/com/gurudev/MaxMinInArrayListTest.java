package com.gurudev;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Test to Find Maximum & Minimum Number in ArrayList")
class MaxMinInArrayListTest {

    private MaxMinInArrayList maxMinInArrayList;

    @BeforeEach
    void setUp() {
        maxMinInArrayList = new MaxMinInArrayList();
    }

    @Order(1)
    @DisplayName("Test to Find Maximum Number in ArrayList")
    @RepeatedTest(5)
    void maxInArrayListTest() {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(24);
        list.add(43);
        list.add(54);
        list.add(45);
        list.add(23);

        assertEquals(54, maxMinInArrayList.maxInArrayList(list));

    }

    @Order(2)
    @DisplayName("Test to Find Minimum Number in ArrayList")
    @RepeatedTest(5)
    void minInArrayListTest() {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(45);
        list.add(53);
        list.add(76);
        list.add(23);
        list.add(95);

        assertEquals(23, maxMinInArrayList.minInArrayList(list));

    }
}



