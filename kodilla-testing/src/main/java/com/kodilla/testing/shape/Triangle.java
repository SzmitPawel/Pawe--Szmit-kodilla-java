package com.kodilla.testing.shape;

public class Triangle implements Shape {

    @Override
    public double getField() {
        double heightOfTriangle = 21;
        double theBaseOfTheTriangle = 40;

        return (theBaseOfTheTriangle * heightOfTriangle) / 2;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }
}
