package com.mycompany.numberguessinggame;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int target = random.nextInt(100) + 1;

        int score = 100;
        int attempts = 0;

        int[] guesses = new int[7];
        boolean found = false;

        System.out.println("===== NUMBER GUESSING GAME =====");
        System.out.println("Guess a number between 1 and 100.");
        System.out.println("You have 7 attempts.");
        System.out.println("Initial score: 100");

        while (attempts < 7) {

            System.out.print("Enter your guess: ");
            int guess = input.nextInt();

            if (guess < 1 || guess > 100) {
                System.out.println("Invalid guess! Enter a number between 1 and 100.");
                continue;
            }

            boolean repeated = false;

            for (int i = 0; i < attempts; i++) {
                if (guesses[i] == guess) {
                    repeated = true;
                    break;
                }
            }

            if (repeated) {
                score -= 15;

                if (score < 0) {
                    score = 0;
                }

                System.out.println("Repeated guess! 15 points deducted.");
                System.out.println("Current score: " + score);
                continue;
            }

            guesses[attempts] = guess;
            attempts++;

            if (guess == target) {

                found = true;

                System.out.println("Correct! You won.");
                System.out.println("Attempts: " + attempts);
                System.out.println("Final score: " + score);
                break;

            } else {

                score -= 10;

                if (score < 0) {
                    score = 0;
                }

                if (guess > target) {
                    System.out.println("Your guess is too high.");
                } else {
                    System.out.println("Your guess is too low.");
                }

                System.out.println("10 points deducted.");
                System.out.println("Current score: " + score);
            }
        }

        if (!found) {
            System.out.println("Game over!");
            System.out.println("The target number was: " + target);
            System.out.println("Final score: " + score);
    }
  }
}
    