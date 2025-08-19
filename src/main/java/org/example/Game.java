package org.example;

import java.util.Scanner;

public class Game {
    private int playerPosition;
    private Dice dice;
    private Board board;

    public Game() {
        playerPosition = 0;
        dice = new Dice();
        board = new Board();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Snakes & Ladders!");
        System.out.println("Starting at position 0...");

        while (true) {
            System.out.println("\nPress ENTER to roll the dice...");
            scanner.nextLine();

            int diceValue = dice.roll();
            System.out.println("You rolled a " + diceValue);

            if (playerPosition + diceValue <= 100) {
                playerPosition += diceValue;
            } else {
                System.out.println("Can't move, need exact roll to reach 100!");
            }

            playerPosition = board.checkPosition(playerPosition);

            System.out.println("Current Position: " + playerPosition);

            if (playerPosition == 100) {
                System.out.println("Congratulations! You won the game!");
                break;
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}
