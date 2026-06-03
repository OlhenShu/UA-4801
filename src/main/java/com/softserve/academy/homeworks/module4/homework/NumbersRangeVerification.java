package com.softserve.academy.homeworks.module4.homework;

import java.util.Scanner;

public class NumbersRangeVerification {
    public static Scanner SCANNER = new Scanner(System.in);

    /**
     * Prompts the user to enter three numbers and verifies if all of them
     * fall within the inclusive range of [-5, 5].
     * This method prints a success message if all numbers are within the range,
     * or a failure message if at least one number falls outside.
     */
    public static void numberRangeVerification() {
        System.out.println("Please enter 1st number");
        double number1 = SCANNER.nextDouble();
        System.out.println("Please enter 2nd number");
        double number2 = SCANNER.nextDouble();
        System.out.println("Please enter 3rd number");
        double number3 = SCANNER.nextDouble();
        if (number1 >= -5 && number1 <= 5 && number2 >= -5 && number2 <= 5 && number3 >= -5 && number3 <= 5) {
            System.out.println("All numbers belong to the range [-5, 5]");
        } else {
            System.out.println("Not all numbers belong to the range [-5, 5].");
        }
    }

    public static void main(String[] args) {
        numberRangeVerification();
        SCANNER.close();
    }
}
