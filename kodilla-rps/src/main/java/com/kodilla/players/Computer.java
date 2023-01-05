package com.kodilla.players;

public class Computer {
    private int score;

    public Computer() {
        this.score = 0;
    }

    public void addOnePoint() {
        this.score++;
    }

    public int getScore() {
        return score;
    }

    public void resetGame() {
        this.score = 0;
    }
}
