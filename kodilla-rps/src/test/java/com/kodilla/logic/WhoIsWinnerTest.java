package com.kodilla.logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhoIsWinnerTest {

    private static int counter = 0;
    private static String result = "";

    @BeforeEach
    void beforeEach() {
        counter++;
        System.out.println("Preparing to execute test# " + counter);
    }

    @Test
    void getWinnerUserWinRockScissors() {
        // give & when
        result = WhoIsWinner.getWinner("rock", "scissors");

        // then
        assertEquals("Player", result);
    }

    @Test
    void getWinnerComputerWinScissorsPaper() {
        // give & when
        result = WhoIsWinner.getWinner("paper", "scissors");

        // then
        assertEquals("Computer", result);
    }

    @Test
    void getWinnerComputerWinPaperRock() {
        // give & when
        result = WhoIsWinner.getWinner("paper", "rock");

        // then
        assertEquals("Player", result);
    }

    @Test
    void getWinnerEqualsChoice() {
        // give & when
        result = WhoIsWinner.getWinner("paper", "paper");

        // then
        assertEquals("Nobody!", result);
    }
}