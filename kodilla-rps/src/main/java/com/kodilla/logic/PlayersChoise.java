package com.kodilla.logic;

import java.util.Random;

public class PlayersChoise {

    // getting computer choice scissors, rock, paper
    public static String getComputerChoice () {

        Random random = new Random();
        String result = "";

        int computerChoice = random.nextInt(3) + 1;

        if ( computerChoice == 1) {
            result = "rock";
        } else if ( computerChoice == 2) {
            result = "paper";
        } else if ( computerChoice == 3) {
            result = "scissors";
        } else {
            result = "";
        }

        return result;
    }

    // getting player choice and translate it from digits to text
    public static String getPlayerChoice (final String playerChoice) {

        String result = "";

        if (playerChoice.equals("1")) {
            result = "rock";
        } else if (playerChoice.equals("2")) {
            result = "paper";
        } else if (playerChoice.equals("3")) {
            result = "scissors";
        } else {
            result = "";
        }

        return result;
    }
}