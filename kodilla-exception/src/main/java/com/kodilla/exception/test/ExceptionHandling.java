package com.kodilla.exception.test;

public class ExceptionHandling {

    public void getSecondChallenge (final double x, final double y) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String result = secondChallenge.probablyIWillThrowException(x,y);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            System.out.println("I am gonna be here... always!");
        }
    }
}
