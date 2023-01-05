package com.kodilla.logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayersChoiceTest {

    private static int counter = 0;

    @BeforeEach
    public void beforeEach() {
        counter++;
        System.out.println("\n" + "Preparing to execute test #" + counter);
    }


    @Test
    void getComputerChoice() {
        // given
        String computerChoice = "";
        boolean result = false;

        // when
        computerChoice = PlayersChoise.getComputerChoice();

        if (computerChoice.equals("paper") || computerChoice.equals("rock") || computerChoice.equals("scissors")) {
            result = true;
        } else {
            result = false;
        }

        // then
        assertEquals(true, result);
    }

    @Test
    void getUserChoiceRock() {
        // given
        String userChoice = "1";

        // when
        String result = PlayersChoise.getPlayerChoice(userChoice);

        // then
        assertEquals("rock", result);
    }

    @Test
    void getUserChoicePaper() {
        // given
        String userChoice = "2";

        // when
        String result = PlayersChoise.getPlayerChoice(userChoice);

        // then
        assertEquals("paper", result);
    }

    @Test
    void getUserChoiceScissors() {
        // given
        String userChoice = "3";

        // when
        String result = PlayersChoise.getPlayerChoice(userChoice);

        // then
        assertEquals("scissors", result);
    }
}