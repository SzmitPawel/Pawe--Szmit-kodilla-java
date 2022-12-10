package com.kodilla.testing.shape;

import static java.lang.Math.pow;

public class Circle implements Shape {

    final private double PI = 3.141592;

    @Override
    public double getField() {
        double radius = 6;
        return PI * pow(radius, 2);
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }
}
