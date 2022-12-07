package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;


public class TestingMain {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int result = calculator.add(2,2);

        if (result == 4) {
            System.out.println("Test OK");
        } else {
            System.out.println("ERROR!");
        }

        result = calculator.subtract(5,2);

        if (result == 3) {
            System.out.println("Test OK");
        } else {
            System.out.println("ERROR!");
        }

    }
}
