package com.softserve.academy.homeworks.module5.homework;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static final Scanner SCANNER = new Scanner(System.in);

    /**
     * Runs an interactive console application that calculates the sum of two numbers.
     * <p>
     * The method loops continuously as long as the user requests to repeat the operation.
     * It includes a robust confirmation check that prompts the user for a "Y" or "N"
     * response, allowing up to 5 attempts to input a valid choice before automatically
     * exiting for security or user inactivity.
     * </p>
     */
    public static void twoNumbersSumCalculator() {
        boolean repeat = false;
        do {
            System.out.println("Please enter 1st number");
            double first = SCANNER.nextDouble();
            System.out.println("Please enter 2nd number");
            double second = SCANNER.nextDouble();
            System.out.println("Their sum is " + (first + second));
            System.out.println("Do you want to perform operation again?");
            int count = 0;
            SCANNER.nextLine();
            while (count < 5) {
                System.out.println("Please enter Y for Yes and N for No");
                String answer = SCANNER.nextLine().toUpperCase();
                if (answer.equals("Y")) {
                    repeat = true;
                    break;
                }
                if (answer.equals("N")) {
                    repeat = false;
                    break;
                }
                count++;
                if (count == 5) {
                    System.out.println("You've entered wrong value 5 times so we assume you don't want to proceed.");
                    repeat = false;
                }
            }
        } while (repeat);
        System.out.println("Thank you for using our services.");
    }

    public static void main(String[] args) {
        twoNumbersSumCalculator();
        SCANNER.close();
    }
}
