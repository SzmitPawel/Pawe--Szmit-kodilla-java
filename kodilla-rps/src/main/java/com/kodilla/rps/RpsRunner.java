package com.kodilla.rps;

import com.kodilla.engine.Game;
import com.kodilla.menu.GameMenu;
import com.kodilla.players.Computer;
import com.kodilla.players.Player;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {

        boolean endGame = false;
        String readPlayerChoice = "";
        Scanner scanner = new Scanner(System.in);

        GameMenu.printTitleOfGame();

        // getting player name and getting how many points to win
        System.out.print("Enter the Player name: ");
        String playerName = scanner.nextLine();
        System.out.print("How many points to Win: ");
        int howManyPointsToWin = scanner.nextInt();
        scanner.nextLine();

        Player player = new Player(playerName, howManyPointsToWin);
        Computer computer = new Computer();

        Game game = new Game(player,computer);

        // game menu
        do {
            GameMenu.printMenu();
            readPlayerChoice = scanner.nextLine();
            readPlayerChoice.toLowerCase();

            if (readPlayerChoice.equals("n")) {
                if (game.doYouWantToStartNewGame() == true) {
                    game.runGame();
                }
            } else if (readPlayerChoice.equals("x")) {
                if (game.doYouWantToEndTheGame() == true){
                    endGame = true;
                }
            } else if (readPlayerChoice.equals("r")) {
                GameMenu.printRulesToWin();
            }

        } while (endGame == false);

        scanner.close();
    }
}