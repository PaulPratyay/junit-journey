package com.gurudev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testing Perimeter of Square, Triangle & Circle")
class PerimeterCalculationTest {

    private PerimeterCalculation perimeterCalculation;

    @BeforeEach
    void setUp() {
        perimeterCalculation = new PerimeterCalculation();
    }

    @DisplayName("Testing perimeter of a square")
    @Test
    void perimeterSquareTest() {
        Assertions.assertEquals(13.799999999999999, perimeterCalculation.perimeterSquare(2.3, 4.6));
    }

    @DisplayName("Testing perimeter of a triangle")
    @Test
    void perimeterTriangleTest() {
        Assertions.assertEquals(25.0, perimeterCalculation.perimeterTriangle(7.6, 9.8, 7.6));
    }

    @DisplayName("Testing perimeter of a circle")
    @Test
    void perimeterCircleTest() {
        Assertions.assertEquals(33.929200658769766, perimeterCalculation.perimeterCircle(5.4));
    }

}
