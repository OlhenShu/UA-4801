package com.softserve.academy.homeworks.module3;

import java.util.Scanner;

public class SmallestNumber {
    /**
     * Compares three integers and returns the smallest value among them.
     * This method utilizes nested Math.min() calls to efficiently evaluate
     * and return the minimum value.
     *
     * @param num1 the first integer to compare
     * @param num2 the second integer to compare
     * @param num3 the third integer to compare
     * @return the smallest of the three provided integers
     */
    public static int smallestOfThreeNumbers(int num1, int num2, int num3) {
        return Math.min(num1, Math.min(num2, num3));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 1st number");
        int num1 = scanner.nextInt();
        System.out.println("Please enter 2nd number");
        int num2 = scanner.nextInt();
        System.out.println("Please enter 3rd number");
        int num3 = scanner.nextInt();
        System.out.println(smallestOfThreeNumbers(num1, num2, num3));
        scanner.close();
    }
}
