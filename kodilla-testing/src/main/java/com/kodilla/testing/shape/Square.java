package com.kodilla.testing.shape;

import static java.lang.Math.pow;

public class Square implements Shape {

    @Override
    public double getField() {
        double sideOfTheSquare = 4;
        return pow(sideOfTheSquare, 2);
    }

    @Override
    public String getShapeName() {
        return "Square";
    }
}
