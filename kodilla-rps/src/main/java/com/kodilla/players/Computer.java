package com.kodilla.players;

public class Computer {
    private int score;
    private String choiceMove;

    public Computer() {
        this.score = 0;
        this.choiceMove = "";
    }

    public void addOnePoint() {
        this.score++;
    }

    public String getChoiceMove() {
        return choiceMove;
    }

    public void setChoiceMove(String choiceMove) {
        this.choiceMove = choiceMove;
    }

    public int getScore() {
        return score;
    }

    public void resetGame() {
        this.score = 0;
    }
}