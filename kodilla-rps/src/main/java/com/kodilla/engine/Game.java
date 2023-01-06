package com.kodilla.engine;

import com.kodilla.logic.WhoIsWinner;
import com.kodilla.menu.GameMenu;
import com.kodilla.players.Computer;
import com.kodilla.players.Player;

import java.util.Scanner;

public class Game {
    Player player;
    Computer computer;

    public Game(Player player, Computer computer) {
        this.player = player;
        this.computer = computer;
    }
    // method to run for one cycle game
    public void runGame() {

        Scanner scanner = new Scanner(System.in);

        String winner = "";
        String readPlayerChoice = "";

        // printing menu and waiting for player choice, move or exit the game.
        do {
            GameMenu.printGameMenu();
            readPlayerChoice = scanner.nextLine();
            readPlayerChoice.toLowerCase();

            // if player chose exit the game
            if (readPlayerChoice.equals("x")) {
                if (doYouWantToEndTheGame() == true) {
                    winner = "Nobody";
                    break;
                }
            }

            // getting player choice
            // scissors, rock or paper
            player.setChoiceMove(readPlayerChoice);

            // calculate winner
            winner = WhoIsWinner.getWinner(this.player, this.computer);

            // if winner is player add point and add move if computer then add point
            // printing round result
            if (winner.equals("Player")) {
                GameMenu.resultOfMove(this.player.getChoiceMove(), this.computer.getChoiceMove(), winner);
                this.player.addOnePoint();
                this.player.addOneMove();

            } else if (winner.equals("Computer")) {
                GameMenu.resultOfMove(this.player.getChoiceMove(), this.computer.getChoiceMove(), winner);
                this.player.addOneMove();
                this.computer.addOnePoint();

            } else {
                this.player.addOneMove();
                GameMenu.resultOfMove(this.player.getChoiceMove(), this.computer.getChoiceMove(), winner);
            }
        } while (this.player.getScore() < this.player.getPointsToWin() && this.computer.getScore() < this.player.getPointsToWin());

        // printing game result and who is winner
        GameMenu.resultOfGame(this.player, this.computer, winner);
    }


    // method to confirm that player want to end the game.
    public boolean doYouWantToEndTheGame() {
        String yesOrNo = "";
        Scanner scanner = new Scanner(System.in);

        System.out.print ("Quit the game ? yes/no ");
        yesOrNo = scanner.nextLine();
        yesOrNo.toLowerCase();

        return yesOrNo.equals("y") ? true : false;
    }

    // method to confirm that player want to start a new game.
    public boolean doYouWantToStartNewGame() {
        String yesOrNo = "";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want to start New Game ? yes/ no ");
        yesOrNo = scanner.nextLine();
        yesOrNo.toLowerCase();

        // if player want to start a new game
        // player and computer scores are resetting
        if (yesOrNo.equals("y")) {
            this.player.resetGame();
            this.computer.resetGame();
            return true;
        } else {
            return false;
        }
    }
}
