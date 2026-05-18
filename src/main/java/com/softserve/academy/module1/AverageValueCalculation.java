package com.softserve.academy.module1;

import java.util.Scanner;

/**
 * Write a program that takes three numbers from
 * console as input to calculate and print output the average of the numbers
 */

public class AverageValueCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        double average = (num1 + num2 + num3) / 3;

        System.out.println("The average of the numbers is: " + average);
    }
}
