package com.kodilla.engine;

import com.kodilla.logic.PlayersChoise;
import com.kodilla.logic.WhoIsWinner;
import com.kodilla.menu.GameMenu;
import com.kodilla.players.Computer;
import com.kodilla.players.Player;

import java.util.Scanner;

public class Game {
    Player player;
    Computer computer;

    public Game(final Player player, final Computer computer) {
        this.player = player;
        this.computer = computer;
    }
    // method to run for one cycle game
    public void runGame() {

        Scanner scanner = new Scanner(System.in);

        String playerChoice = "";
        String computerChoice = "";

        String winner = "";
        String choice = "";

        // printing menu and waiting for player choice, move or exit the game.
        do {
            GameMenu.printGameMenu();
            choice = scanner.nextLine();

            // if player chose exit the game
            if (choice.equals("x")) {
                if (doYouWantToEndTheGame().equals("y")) {
                    winner = "Nobody";
                    break;
                }
            }

            // getting player and computer choice, scissors, rock or paper
            playerChoice = PlayersChoise.getPlayerChoice(choice);
            computerChoice = PlayersChoise.getComputerChoice();

            // calculate winner
            winner = WhoIsWinner.getWinner(playerChoice, computerChoice);

            // if winner is player add point and add move if computer then add points
            // printing round result
            if (winner.equals("Player")) {
                GameMenu.resultOfMove(playerChoice, computerChoice, winner);
                this.player.addOnePoint();
                this.player.addOneMove();
            } else if (winner.equals("Computer")) {
                GameMenu.resultOfMove(playerChoice, computerChoice, winner);
                this.player.addOneMove();
                this.computer.addOnePoint();
            } else {
                GameMenu.resultOfMove(playerChoice, computerChoice, winner);
            }
        } while (this.player.getScore() < this.player.getPointsToWin() && this.computer.getScore() < this.player.getPointsToWin());

        // printing game result and who is winner
        GameMenu.resultOfGame(this.player, this.computer, winner);
    }


    // method to confirm that player want to end the game.
    public String doYouWantToEndTheGame() {
        String yesOrNo = "";
        Scanner scanner = new Scanner(System.in);

        System.out.print ("Quit the game ? yes/no ");
        yesOrNo = scanner.nextLine();

        return yesOrNo.equals("y") ? "y" : "n";
    }

    // method to confirm that player want to start a new game.
    public String doYouWantToStartNewGame() {
        String yesOrNo = "";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want to start New Game ? yes/ no ");
        yesOrNo = scanner.nextLine();

        // if player want to start a new game
        // player and computer scores are resetting
        if (yesOrNo.equals("y")) {
            this.player.resetGame();
            this.computer.resetGame();
            return "y";
        } else {
            return "n";
        }
    }
}
