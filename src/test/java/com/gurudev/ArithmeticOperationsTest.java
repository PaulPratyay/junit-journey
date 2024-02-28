package com.gurudev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testing Arithmetic Operations")
class ArithmeticOperationsTest {

    @DisplayName("Testing all arithmetic Operations")
    @Test
    void arithmeticOperationTest() {

        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();

        Assertions.assertEquals(6.010000000000001, arithmeticOperations.calculateDivision(108.18, 18));
        Assertions.assertEquals(1944, arithmeticOperations.calculateMultiplication(108, 18));
        Assertions.assertEquals(126, arithmeticOperations.calculateAddition(108, 18));
        Assertions.assertEquals(90, arithmeticOperations.calculateSubtraction(108, 18));
        Assertions.assertEquals(0.0, arithmeticOperations.calculateModulus(108, 18));

    }

    @DisplayName("Testing Division Operation")
    @Test
    void calculateDivisionTest() {
        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
        Assertions.assertEquals(0.9021582733812948, arithmeticOperations.calculateDivision(12.54, 13.9));
    }

    @DisplayName("Testing Multiplication Operation")
    @Test
    void calculateMultiplicationTest() {
        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
        Assertions.assertEquals(8663.1295, arithmeticOperations.calculateMultiplication(93.95, 92.21));
    }

    @DisplayName("Testing Addition Operation")
    @Test
    void calculateAdditionTest() {
        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
        Assertions.assertEquals(779.754, arithmeticOperations.calculateAddition(543.565, 236.189));
    }

    @DisplayName("Testing Subtraction Operation")
    @Test
    void calculateSubtractionTest() {
        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
        Assertions.assertEquals(-210.101, arithmeticOperations.calculateSubtraction(764.134, 974.235));
    }

    @DisplayName("Testing Modulus Operation")
    @Test
    void calculateModulusTest() {
        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
        Assertions.assertEquals(1.82000000000005, arithmeticOperations.calculateModulus(541.82, 18));
    }
}
