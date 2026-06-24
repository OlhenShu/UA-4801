package com.softserve.academy.homeworks.module5.homework;

import java.util.Arrays;
import java.util.Scanner;

public class FiveIntMath {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final int ARRAY_LENGTH = 5;

    /**
     * Prompts the user to populate an integer array with values via the console.
     * This method dynamically adjusts the messaging for the first input versus
     * subsequent inputs and returns the fully populated array.
     *
     * @return a populated int array containing the user's inputs
     */
    public static int[] getIntValuesFromUser() {
        System.out.println("Please enter 5 numbers");
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
     * Searches an integer array to find the 1-based position of the second positive number.
     * <p>
     * This method iterates through the array, tracking the occurrences of positive integers.
     * Upon finding the second positive integer, it prints and returns its 1-based index position.
     * If fewer than two positive numbers are found, it prints a message and returns -1.
     * </p>
     *
     * @param numbers the array of integers to search through
     * @return the 1-based position of the second positive number, or -1 if not found
     */
    public static int positionOfSecondPositiveNumber(int[] numbers) {
        int count = 0;
        int position = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                count++;
            }
            if (count == 2) {
                position = i + 1;
                break;
            }
        }
        if (count == 2) {
            System.out.println("Position of second positive number is " + position);
            return position;
        } else {
            System.out.println("There are fewer than 2 positive numbers in array");
            return -1;
        }
    }

    /**
     * Traverses an integer array to find the minimum value and its corresponding 1-based position.
     * <p>
     * This method initializes the search by assuming the first element is the minimum,
     * then iterates through the remaining elements to update the tracking variables
     * whenever a smaller value is encountered.
     * </p>
     *
     * @param numbers the array of integers to evaluate
     */
    public static void minValueAndItsPosition(int[] numbers) {
        int min = numbers[0];
        int position = 1;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                position = i + 1;
            }
        }
        System.out.println("Min number is " + min + " and it's position is " + position);
    }

    /**
     * Calculates and prints the product of all non-zero even numbers within an integer array.
     * <p>
     * This method iterates through the array, using a flag to track if any valid even numbers
     * exist. If no non-zero even numbers are present, it displays an error message;
     * otherwise, it prints the calculated cumulative product.
     * </p>
     *
     * @param numbers the array of integers to evaluate
     */
    public static void productOfEvenNumbers(int[] numbers) {
        int product = 1;
        boolean noEvenNumbers = true;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 && numbers[i] != 0) {
                product *= numbers[i];
                noEvenNumbers = false;
            }
        }
        if (noEvenNumbers) {
            System.out.println("There are no even numbers in array");
            return;
        }
        System.out.println("Product of even numbers is " + product);
    }

    public static void main(String[] args) {
        int[] numbersFromUser = getIntValuesFromUser();
        System.out.println(Arrays.toString(numbersFromUser));
        positionOfSecondPositiveNumber(numbersFromUser);
        minValueAndItsPosition(numbersFromUser);
        productOfEvenNumbers(numbersFromUser);
        SCANNER.close();
    }
}
