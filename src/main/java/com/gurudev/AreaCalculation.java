package com.gurudev;

public class AreaCalculation {

    public double squareArea(double length, double width) {
        return length * width;
    }

    public double triangleArea (double base, double height) {
        return 0.5 * base * height;
    }

    public double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
