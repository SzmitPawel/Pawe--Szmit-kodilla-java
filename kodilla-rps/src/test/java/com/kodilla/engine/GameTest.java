package com.kodilla.engine;

import com.kodilla.players.Computer;
import com.kodilla.players.Player;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    private static Game game;
    private static Player player;
    private static Computer computer;

    private static int counter;

    @BeforeAll
    static void beforeAll() {
        player = new Player("Player", 1);
        computer = new Computer();
        game = new Game(player,computer);
    }

    @BeforeEach
    void beforeEach() {
        counter++;
        System.out.println("\n" + "Preparing to execute test #" + counter);
    }

    @Test
    void doYouWantToEndTheGame() {
        // given
        String input = "y";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        // when
        boolean result = game.doYouWantToEndTheGame();

        // then
        assertTrue(result);
    }

    @Test
    void doYouWantToStartNewGameNo() {
        // given
        String input = "n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        player.addOneMove();
        player.addOnePoint();
        computer.addOnePoint();

        // when
        boolean result = game.doYouWantToStartNewGame();

        // then
        assertFalse(result);
        assertEquals(1, player.getScore());
        assertEquals(1, player.getMovements());
        assertEquals(1, computer.getScore());
    }

    @Test
    void doYouWantToStartNewGameYes() {
        // given
        String input = "y";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        player.addOneMove();
        player.addOnePoint();
        computer.addOnePoint();

        // when
        boolean result = game.doYouWantToStartNewGame();

        // then
        assertTrue(result);
        assertEquals(0, player.getScore());
        assertEquals(0, player.getMovements());
        assertEquals(0, computer.getScore());
    }
}