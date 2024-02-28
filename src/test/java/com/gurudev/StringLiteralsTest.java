package com.gurudev;

import org.junit.jupiter.api.*;

@DisplayName("String Literal Testing")
class StringLiteralsTest {

    private StringLiterals stringLiterals;

    @BeforeEach
    void setUp() {
        stringLiterals = new StringLiterals();
    }

    @DisplayName("Testing String Example 1")
    @Test
    void stringExample1Test() {
        Assertions.assertEquals("Java is platform independent", stringLiterals.stringExample1());
    }


    @DisplayName("Testing String Example 2")
    @Test
    void stringExample2Test() {
        Assertions.assertEquals("Is Java 100% object-oriented?", stringLiterals.stringExample2());
    }

    @DisplayName("Testing String Example 3")
    @Test
    void stringExample3Test() {
        Assertions.assertEquals("Happy Testing!", stringLiterals.stringExample3());
    }
}
