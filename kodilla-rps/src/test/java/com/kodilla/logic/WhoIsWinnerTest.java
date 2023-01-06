package com.kodilla.logic;

import com.kodilla.players.Computer;
import com.kodilla.players.Player;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhoIsWinnerTest {

    private static Player player;
    private static Computer computer;

    @BeforeAll
    static void beforeAll () {
        player = new Player("Player", 1);
        computer = new Computer();

    }

    @Test
    void getWinnerPlayerChoseRock() {
        // given
        player.setChoiceMove("1"); // rock
        boolean result = false;

        // when
        String winner = WhoIsWinner.getWinner(player,computer);
        String computerChoice = computer.getChoiceMove();

        // then
        if (winner.equals("Player") && computerChoice.equals("lizard")) {
            result = true;
        } else if (winner.equals("Nobody!") && computerChoice.equals("rock")) {
            result = true;
        } else if (winner.equals("Computer") && computerChoice.equals("spock")) {
            result = true;
        }
        assertTrue(result);
    }

    @Test
    void getWinnerPlayerChoseLizard() {
        // given
        player.setChoiceMove("2"); // lizard
        boolean result = false;

        // when
        String winner = WhoIsWinner.getWinner(player,computer);
        String computerChoice = computer.getChoiceMove();

        // then
        if (winner.equals("Player") && computerChoice.equals("spock")) {
            result = true;
        } else if (winner.equals("Nobody!") && computerChoice.equals("lizard")) {
            result = true;
        } else if (winner.equals("Computer") && computerChoice.equals("rock")) {
            result = true;
        }
        assertTrue(result);
    }

    @Test
    void getWinnerPlayerChoseSpock() {
        // given
        player.setChoiceMove("3"); // spock
        boolean result = false;

        // when
        String winner = WhoIsWinner.getWinner(player,computer);
        String computerChoice = computer.getChoiceMove();

        // then
        if (winner.equals("Player") && computerChoice.equals("scissors")) {
            result = true;
        } else if (winner.equals("Nobody!") && computerChoice.equals("spock")) {
            result = true;
        } else if (winner.equals("Computer") && computerChoice.equals("paper")) {
            result = true;
        }
        assertTrue(result);
    }

    @Test
    void getWinnerPlayerChoseScissors() {
        // given
        player.setChoiceMove("4"); // scissors
        boolean result = false;

        // when
        String winner = WhoIsWinner.getWinner(player,computer);
        String computerChoice = computer.getChoiceMove();

        // then
        if (winner.equals("Player") && computerChoice.equals("lizard")) {
            result = true;
        } else if (winner.equals("Nobody!") && computerChoice.equals("scissors")) {
            result = true;
        } else if (winner.equals("Computer") && computerChoice.equals("spock")) {
            result = true;
        }
        assertTrue(result);
    }

    @Test
    void getWinnerPlayerChosePaper() {
        // given
        player.setChoiceMove("5"); // paper
        boolean result = false;

        // when
        String winner = WhoIsWinner.getWinner(player,computer);
        String computerChoice = computer.getChoiceMove();

        // then
        if (winner.equals("Player") && computerChoice.equals("spock")) {
            result = true;
        } else if (winner.equals("Nobody!") && computerChoice.equals("paper")) {
            result = true;
        } else if (winner.equals("Computer") && computerChoice.equals("lizard")) {
            result = true;
        }
        assertTrue(result);
    }
}