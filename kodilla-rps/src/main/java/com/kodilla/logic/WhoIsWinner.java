package com.kodilla.logic;

import com.kodilla.players.Computer;
import com.kodilla.players.Player;

import java.util.Random;

public class WhoIsWinner {

    public static String getWinner(Player player, Computer computer) {

        String winner = "";

        // There is 0.25 probability losing of a computer (25%)
        // There is 0.25 probability draw of a computer (25%)
        // There is 0.50 probability winning of a computer (50%)

        Random random = new Random();
        double probability = random.nextDouble();

        final double LOSING = 0.25; // 0.25%
        final double DRAW = 0.5; // 0.25% + 0.25%
        final double WINNING = 0.5; // 1.0% - 0.5% = 0.5%

        // player chose rock
        if (player.getChoiceMove().equals("rock")) {
            if (probability <= LOSING) {
                computer.setChoiceMove("lizard");
                winner = "Player";
            } else if (probability <= DRAW) {
                computer.setChoiceMove("rock");
                winner = "Nobody!";
            } else {
                computer.setChoiceMove("spock");
                winner = "Computer";
            }
        }

        // player chose lizard
        if (player.getChoiceMove().equals("lizard")) {
            if (probability <= LOSING) {
                computer.setChoiceMove("spock");
                winner = "Player";
            } else if (probability <= DRAW) {
                computer.setChoiceMove("lizard");
                winner = "Nobody!";
            } else {
                computer.setChoiceMove("rock");
                winner = "Computer";
            }
        }

        // player chose spock
        if (player.getChoiceMove().equals("spock")) {
            if (probability <= LOSING) {
                computer.setChoiceMove("scissors");
                winner = "Player";
            } else if (probability <= DRAW) {
                computer.setChoiceMove("spock");
                winner = "Nobody!";
            } else {
                computer.setChoiceMove("paper");
                winner = "Computer";
            }
        }

        // player chose scissors
        if (player.getChoiceMove().equals("scissors")) {
            if (probability <= LOSING) {
                computer.setChoiceMove("lizard");
                winner = "Player";
            } else if (probability <= DRAW) {
                computer.setChoiceMove("scissors");
                winner = "Nobody!";
            } else {
                computer.setChoiceMove("spock");
                winner = "Computer";
            }
        }

        // player chose paper
        if (player.getChoiceMove().equals("paper")) {
            if (probability <= LOSING) {
                computer.setChoiceMove("spock");
                winner = "Player";
            } else if (probability <= DRAW) {
                computer.setChoiceMove("paper");
                winner = "Nobody!";
            } else {
                computer.setChoiceMove("lizard");
                winner = "Computer";
            }
        }
        return winner;
    }
}