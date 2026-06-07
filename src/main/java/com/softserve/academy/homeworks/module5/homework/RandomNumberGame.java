package com.softserve.academy.homeworks.module5.homework;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {
    public static final Scanner SCANNER = new Scanner(System.in);

    /**
     * Executes a number-guessing game where the computer generates a random number
     * between 0 and 500 (inclusive), and the user repeatedly guesses until they match it.
     * <p>
     * The method utilizes a do-while loop to ensure the user is prompted at least once,
     * providing "Too high" or "Too low" feedback after each attempt.
     * </p>
     *
     * @param args command-line arguments (not used in this application)
     */
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(0, 501);

        System.out.println("I have a number for you to guess. What do you think it is?");
        int numberFromUser = -1;
        do {
            System.out.println("Please enter your suggestion:");
            numberFromUser = SCANNER.nextInt();
            if (numberFromUser > numberToGuess) {
                System.out.println("Too high, try again.");
            }
            if (numberFromUser < numberToGuess) {
                System.out.println("Too low, try againl.");
            }
        } while (numberFromUser != numberToGuess);
        System.out.println("Correct, my number was " + numberToGuess + ". Congratulations!");
    }
}
