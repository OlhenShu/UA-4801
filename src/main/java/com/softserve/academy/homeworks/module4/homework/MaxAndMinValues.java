package com.softserve.academy.homeworks.module4.homework;

import java.util.Scanner;

public class MaxAndMinValues {
    private static final Scanner SCANNER = new Scanner(System.in);

    /**
     * Prompts the user for three integers, validates that they are unique, and
     * finds the maximum and minimum values using sequential comparison checks.
     * <p>
     * If any numbers are equal, it exits early. Otherwise, it iteratively updates
     * tracker variables to isolate the highest and lowest values, printing both.
     * </p>
     */
    public static void minAndMax() {
        System.out.println("Please enter 1st number");
        int number1 = SCANNER.nextInt();
        System.out.println("Please enter 2nd number");
        int number2 = SCANNER.nextInt();
        System.out.println("Please enter 3rd number");
        int number3 = SCANNER.nextInt();
        if (number1 == number2 || number2 == number3 || number1 == number3) {
            System.out.println("There are 2 or more equal numbers. Try next time with different values.");
            return;
        }
        int maxNumber = number1;
        if (number2 > maxNumber){
            maxNumber = number2;
        }
        if (number3 > maxNumber){
            maxNumber = number3;
        }
        System.out.println(maxNumber + " is max.");
        int minNumber = number1;
        if (number2 < minNumber){
            minNumber = number2;
        }
        if (number3 < minNumber){
            minNumber = number3;
        }
        System.out.println(minNumber + " is min.");
    }

    /**
     * Prompts the user for three integers, ensures they are unique, and determines
     * the maximum and minimum values using nested conditional statements.
     * <p>
     * If any two numbers are equal, the method prints a warning and exits early.
     * Otherwise, it evaluates and prints the absolute highest and lowest numbers.
     * </p>
     */
    public static void minAndMax2() {
        System.out.println("Please enter 1st number");
        int number1 = SCANNER.nextInt();
        System.out.println("Please enter 2nd number");
        int number2 = SCANNER.nextInt();
        System.out.println("Please enter 3rd number");
        int number3 = SCANNER.nextInt();
        if (number1 == number2 || number2 == number3 || number1 == number3) {
            System.out.println("There are 2 or more equal numbers. Try next time with different values.");
            return;
        }
        if (number1 > number2) {
            if (number1 > number3) {
                System.out.println(number1 + " is max.");
                if (number2 > number3) {
                    System.out.println(number3 + " is min");
                } else {
                    System.out.println(number2 + " is min");
                }
            } else {
                System.out.println(number3 + " is max.");
                System.out.println(number2 + " is min");
            }
        } else {
            if (number2 > number3) {
                System.out.println(number2 + " is max.");
                if (number1 > number3) {
                    System.out.println(number3 + " is min");
                } else {
                    System.out.println(number1 + " is min");
                }
            } else {
                System.out.println(number3 + " is max.");
                System.out.println(number1 + " is min");
            }
        }
    }

    public static void main(String[] args) {
        minAndMax();
        SCANNER.close();
    }

    public static void minAndMax3() {
        System.out.println("Please enter 1st number");
        int number1 = SCANNER.nextInt();
        System.out.println("Please enter 2nd number");
        int number2 = SCANNER.nextInt();
        System.out.println("Please enter 3rd number");
        int number3 = SCANNER.nextInt();
        if (number1 == number2 || number2 == number3 || number1 == number3) {
            System.out.println("There are 2 or more equal numbers. Try next time with different values.");
            return;
        }
        if (number1 > number2) {
            if (number1 > number3) {
                System.out.println(number1 + " is max.");
            } else {
                System.out.println(number3 + " is max.");
            }
        } else {
            if (number2 > number3) {
                System.out.println(number2 + " is max.");
            } else {
                System.out.println(number3 + " is max.");
            }
        }
        if (number1 < number2) {
            if (number1 < number3) {
                System.out.println(number1 + " is min.");
            } else {
                System.out.println(number3 + " is min.");
            }
        } else {
            if (number2 < number3) {
                System.out.println(number2 + " is min.");
            } else {
                System.out.println(number3 + " is min.");
            }
        }
    }


}
