package com.gurudev;

public class PerimeterCalculation {

    public double perimeterSquare(double length, double width) {
        return 2 * (length + width);
    }

    public double perimeterTriangle(double side1, double base, double side2) {
        return side1 + base + side2;
    }

    public double perimeterCircle(double radius) {
        return 2 * Math.PI * radius;
    }

}
