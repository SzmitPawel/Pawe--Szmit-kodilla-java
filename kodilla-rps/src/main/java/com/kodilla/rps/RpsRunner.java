package com.kodilla.rps;

import com.kodilla.engine.Game;
import com.kodilla.menu.GameMenu;
import com.kodilla.players.Computer;
import com.kodilla.players.Player;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {

        String choice = "";
        Scanner scanner = new Scanner(System.in);

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
            choice = scanner.nextLine();

            if (choice.equals("n")) {
                if (game.doYouWantToStartNewGame().equals("y")) {
                    game.runGame();
                }
            } else if (choice.equals("x")) {
                if (game.doYouWantToEndTheGame().equals("n")){
                    choice = "";
                }
            }

        } while (!choice.equals("x"));

        scanner.close();
    }
}