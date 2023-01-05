package com.kodilla.menu;

import com.kodilla.players.Computer;
import com.kodilla.players.Player;

public class GameMenu {

    public static void printMenu() {
        System.out.println();
        System.out.println("Legend: ");
        System.out.println("        n - Start a New Game");
        System.out.println("        x - End the Game" );
        System.out.print("Please choice: ");
    }

    public static void printGameMenu() {
        System.out.println();
        System.out.println("        1 - Rock");
        System.out.println("        2 - Paper");
        System.out.println("        3 - Scissors");
        System.out.println("        x - End the Game" );
        System.out.print("Make your move: ");
    }

    public static void resultOfGame (final Player player, final Computer computer, final String winner) {

        String finalWinner = winner;

        if (winner.equals("Player")) {
            finalWinner = player.getPlayerName();
        } else if (winner.equals("Computer")) {
            finalWinner = "Computer";
        } else {
            finalWinner = "Nobody";
        }

        System.out.println();
        System.out.println("                  The Winner is " + finalWinner);
        System.out.println();
        System.out.println("Player " +
                player.getPlayerName() +
                ": " +
                player.getScore()+
                " score " +
                player.getMovements()+
                " Move " +
                "     " +
                " Computer: " +
                computer.getScore()+
                " score");
    }

    public static void resultOfMove (final String playerChoice, final String computerChoice, final String winner) {
        System.out.println();
        System.out.println("Players move: " + playerChoice + "     " + "Computer move: " + computerChoice);
        System.out.println("The Winner is: " + winner);
    }
}