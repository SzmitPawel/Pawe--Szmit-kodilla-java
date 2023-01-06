package com.kodilla.players;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayerTest {

    private static int counter = 0;

    private Player prepareData() {

        String playerName = "Player";
        int pointsToWin = 3;

        Player player = new Player(playerName, pointsToWin);

        return player;
    }


    @BeforeEach
    void beforeEach () {
        counter++;
        System.out.println("\n" + "Preparing to execute test #" + counter);
    }

    @Test
    void addOnePointAndGetScore() {
        // give
        Player player = prepareData();
        player.addOnePoint();

        // when
        int result = player.getScore();;

        // then
        assertEquals(1, result);

    }

    @Test
    void getUserName() {
        // give
        Player player = prepareData();

        // when
        String result = player.getPlayerName();

        // then
        assertEquals("Player", result);
    }

    @Test
    void addOneMoveAndGet() {
        // give
        Player player = prepareData();
        player.addOneMove();

        // when
        int result = player.getMovements();

        // then
        assertEquals(1, result);
    }

    @Test
    void resetGame() {
        // give
        Player player = prepareData();
        player.addOnePoint();
        player.addOneMove();

        // when
        player.resetGame();

        // then
        assertEquals(0, player.getScore());
        assertEquals(0, player.getMovements());
    }

    @Test
    void choiceMoveGetAndSetSpock() {
        // give
        Player player = prepareData();
        player.setChoiceMove("3"); // spock

        // when
        String result = player.getChoiceMove();

        // then
        assertEquals("spock", result);

    }

    @Test
    void choiceMoveGetAndSetPaper() {
        // give
        Player player = prepareData();
        player.setChoiceMove("5"); // paper

        // when
        String result = player.getChoiceMove();

        // then
        assertEquals("paper", result);

    }
}