package com.kodilla.players;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {

    private static int counter = 0;

    @BeforeEach
    public void beforeEach() {
        counter++;
        System.out.println("\n" + "Preparing to execute test #" + counter);
    }

    @Test
    void addOnePointAndGet() {
        // give
        Computer computer = new Computer();
        computer.addOnePoint();

        // when
        int result = computer.getScore();

        // then
        assertEquals(1, result);

    }

    @Test
    void resetGame() {
        // give
        Computer computer = new Computer();
        computer.addOnePoint();

        // when
        computer.resetGame();

        // then
        assertEquals(0, computer.getScore());
    }

    @Test
    void setChoiceMove() {
        // give
        Computer computer = new Computer();
        computer.setChoiceMove("rock");

        // when
        String result = computer.getChoiceMove();

        // then
        assertEquals("rock", result);
    }
}