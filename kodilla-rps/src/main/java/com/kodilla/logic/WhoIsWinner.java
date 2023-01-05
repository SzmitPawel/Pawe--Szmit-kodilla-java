package com.kodilla.logic;

public final class WhoIsWinner {

    public static String getWinner(final String playerChoice, final String computerChoice) {

        String winner = "";

        // winner logic
        // rock - scissors
        if (computerChoice.equals("rock") && playerChoice.equals("scissors")) {
            winner = "Computer";
        } else if (playerChoice.equals("rock") && computerChoice.equals("scissors")) {
            winner = "Player";
        }

        // scissors - paper
        if (computerChoice.equals("scissors") && playerChoice.equals("paper")) {
            winner = "Computer";
        } else if (playerChoice.equals("scissors") && computerChoice.equals("paper")) {
            winner = "Player";
        }

        // paper - rock
        if (computerChoice.equals("paper") && playerChoice.equals("rock")) {
            winner = "Computer";
        } else if (playerChoice.equals("paper") && computerChoice.equals("rock")) {
            winner = "Player";
        }

        // equals choice
        if (computerChoice.equals(playerChoice)) {
            winner = "Nobody!";
        }

        return winner;
    }
}