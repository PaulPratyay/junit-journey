package com.gurudev;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Testing area of Square, Triangle & Circle")
class AreaCalculationTest {

    @DisplayName("Testing area of a square, triangle and circle together")
    @Test
    void areaCalculationTest() {
        AreaCalculation areaCalculation = new AreaCalculation();

        Assertions.assertEquals(312.12, areaCalculation.squareArea(25.5, 12.24));
        Assertions.assertEquals(401.8402, areaCalculation.triangleArea(23.39, 34.36));
        Assertions.assertEquals(1460.3178229016962, areaCalculation.circleArea(21.56));
    }

    @Order(1)
    @DisplayName("Testing area of a square")
    @Test
    void squareAreaTest() {
        AreaCalculation areaCalculation = new AreaCalculation();
        Assertions.assertEquals(45.08, areaCalculation.squareArea(9.8, 4.6));
    }

    @Order(2)
    @DisplayName("Testing area of a triangle")
    @Test
    void triangleAreaTest() {
        AreaCalculation areaCalculation = new AreaCalculation();
        Assertions.assertEquals(19.32, areaCalculation.triangleArea(4.6, 8.4));
    }

    @Order(3)
    @DisplayName("Testing area of a circle")
    @Test
    void circleAreaTest() {
        AreaCalculation areaCalculation = new AreaCalculation();
        Assertions.assertEquals(91.60884177867837, areaCalculation.circleArea(5.4));
    }


}
