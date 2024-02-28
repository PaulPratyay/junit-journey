package com.gurudev;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Testing Perimeter of Square, Triangle & Circle")
class PerimeterCalculationTest {

    private PerimeterCalculation perimeterCalculation;

    @BeforeEach
    void setUp() {
        perimeterCalculation = new PerimeterCalculation();
    }

    @Order(1)
    @DisplayName("Testing perimeter of a square")
    @Test
    void perimeterSquareTest() {
        Assertions.assertEquals(13.799999999999999, perimeterCalculation.perimeterSquare(2.3, 4.6));
    }

    @Order(2)
    @DisplayName("Testing perimeter of a triangle")
    @Test
    void perimeterTriangleTest() {
        Assertions.assertEquals(25.0, perimeterCalculation.perimeterTriangle(7.6, 9.8, 7.6));
    }

    @Order(3)
    @DisplayName("Testing perimeter of a circle")
    @Test
    void perimeterCircleTest() {
        Assertions.assertEquals(33.929200658769766, perimeterCalculation.perimeterCircle(5.4));
    }

}
