package com.kodilla.players;

public class Player {

    final private String playerName;
    final private int pointsToWin;
    private int score;
    private int movements;

    private String choiceMove;

    public Player(final String playerName, final int pointsToWin) {
        this.score = 0;
        this.movements=0;
        this.pointsToWin = pointsToWin;
        this.playerName = playerName;
        this.choiceMove = "";
    }

    public void addOnePoint() {
        this.score++;
    }

    public void addOneMove() {
        this.movements++;
    }

    public int getScore() {
        return score;
    }

    public int getPointsToWin() {
        return pointsToWin;
    }

    public String getChoiceMove() {
        return choiceMove;
    }

    public void setChoiceMove(String choiceMove) {

        int checkMenuChoice = Integer.parseInt(choiceMove);

        if (checkMenuChoice == 1) {
            this.choiceMove = "rock";
        } else if (checkMenuChoice == 2) {
            this.choiceMove = "paper";
        } else if (checkMenuChoice == 3) {
            this.choiceMove = "scissors";
        } else {
            this.choiceMove = "";
        }
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getMovements() {
        return movements;
    }

    public void resetGame() {
        this.score = 0;
        this.movements = 0;
    }
}