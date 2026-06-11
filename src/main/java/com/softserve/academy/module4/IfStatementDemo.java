package com.softserve.academy.module4;

import java.util.Scanner;

public class IfStatementDemo {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number:");
        double number = scanner.nextDouble();
        if (number > 0 && number <= 100) {
            System.out.println("The number is positive and less than 100");
        } else if (number == 0) {
            System.out.println("The number is zero");
        } else if (number < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is greater than to 100");
        }

        if (number > 0 && number < 100) {
            System.out.println("The number is positive and less than 100");
        }
        if (number == 0) {
            System.out.println("The number is zero");
        }
        System.out.println("This line will be printed regardless of the value of number");
        if (number < 0) {
            System.out.println("The number is negative");
        }
        if (number >= 100) {
            System.out.println("The number is greater than or equal to 100");
        }

        System.out.println("The number is " + number);
        System.out.println("The end of the program");
        scanner.close();
    }
}
