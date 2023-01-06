package com.kodilla.menu;

import com.kodilla.players.Computer;
import com.kodilla.players.Player;

public class GameMenu {

    public static void printMenu() {
        System.out.println();
        System.out.println("Legend: ");
        System.out.println("        r - The Game rules");
        System.out.println("        n - Start a New Game");
        System.out.println("        x - End the Game" );
        System.out.print("Please choice: ");
    }

    public static void printGameMenu() {
        System.out.println();
        System.out.println("        1 - Rock");
        System.out.println("        2 - Lizard");
        System.out.println("        3 - Spock");
        System.out.println("        4 - Scissors");
        System.out.println("        5 - Paper");
        System.out.println("        x - End the Game" );
        System.out.print("Make your move: ");
    }

    public static void printTitleOfGame() {
        System.out.println("              Time to play Rock, Paper, Scissors, Lizard, Spock!");
        System.out.println();
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
                " move " +
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

    public static void printRulesToWin () {
        System.out.println();
        System.out.println("The rules? It's very simple." + "\n");
        System.out.println("Scissors cuts paper,");
        System.out.println("paper covers rock,");
        System.out.println("rock crushes lizard,");
        System.out.println("lizard poisons Spock,");
        System.out.println("Spock smashes scissors,");
        System.out.println("scissors decapitates lizard,");
        System.out.println("lizard eats paper,");
        System.out.println("paper disproves Spock,");
        System.out.println("Spock vaporizes rock,");
        System.out.println("and, as it always has,");
        System.out.println("rock crushes scissors.");
        System.out.println(" -Sheldon Cooper, Ph.D" + "\n");
        System.out.println("If you and the computer both select the same weapon,");
        System.out.println("then that particular game will be canceled and another game will be played.");
        System.out.println("Your weapon choices are:: Rock, Paper, Scissors, Lizard, and... Spock!");
    }
}