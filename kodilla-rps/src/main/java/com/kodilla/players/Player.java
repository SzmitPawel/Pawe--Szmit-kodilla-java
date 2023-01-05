package com.kodilla.players;

public class Player {

    final private String playerName;
    final private int pointsToWin;
    private int score;
    private int movements;

    public Player(final String playerName, final int pointsToWin) {
        this.score = 0;
        this.movements=0;
        this.pointsToWin = pointsToWin;
        this.playerName = playerName;
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