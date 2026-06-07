package com.softserve.academy.homeworks.module5.homework;

import java.util.Arrays;
import java.util.Scanner;

public class TenIntMath {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final int ARRAY_LENGTH = 10;

    /**
     * Prompts the user to populate an integer array with values via the console.
     * This method dynamically adjusts the messaging for the first input versus
     * subsequent inputs and returns the fully populated array.
     *
     * @return a populated int array containing the user's inputs
     */
    public static int[] getIntValuesFromUser() {
        System.out.println("Please enter 10 numbers");
        int[] arrayOfInt = new int[ARRAY_LENGTH];
        for (int i = 0; i < arrayOfInt.length; i++) {
            if (i == 0) {
                System.out.println("Please enter number.");
                arrayOfInt[i] = SCANNER.nextInt();
                continue;
            }
            System.out.println("Please enter next number");
            arrayOfInt[i] = SCANNER.nextInt();
        }
        return arrayOfInt;
    }

    /**
     * Evaluates a 10-element integer array and executes a split mathematical operation.
     * <p>
     * If all elements in the first half of the array are non-negative, the method calculates
     * and returns their sum. Otherwise, it calculates and returns the product of the second half.
     * </p>
     *
     * @param numbers the array of integers to evaluate (expected length matching ARRAY_LENGTH, which is 10)
     * @return the sum of the first half if all are positive, or the product of the second half if any are negative
     */
    public static int mathForTenNumbers(int[] numbers) {
        if (numbers.length != ARRAY_LENGTH) {
            System.out.println("Please provide 10 numbers");
            return 0;
        }
        boolean firstHalfIsPositive = true;
        for (int i = 0; i < numbers.length / 2; i++) {
            if (numbers[i] < 0) {
                firstHalfIsPositive = false;
                break;
            }
        }
        if (firstHalfIsPositive) {
            int sum = 0;
            for (int i = 0; i < numbers.length / 2; i++) {
                sum += numbers[i];
            }
            System.out.println("The sum of 1st 5 numbers is: " + sum);
            return sum;
        } else {
            int prod = 1;
            for (int i = numbers.length / 2; i < numbers.length; i++) {
                prod *= numbers[i];
            }
            System.out.println("The product of last 5 numbers is: " + prod);
            return prod;
        }
    }

    public static void main(String[] args) {
        int[] numbersFromUser = getIntValuesFromUser();
        System.out.println(Arrays.toString(numbersFromUser));
        int mathResult = mathForTenNumbers(numbersFromUser);
        SCANNER.close();
    }
}
