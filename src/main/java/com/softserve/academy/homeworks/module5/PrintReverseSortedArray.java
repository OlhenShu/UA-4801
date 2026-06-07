package com.softserve.academy.homeworks.module5;

import java.util.Arrays;

public class PrintReverseSortedArray {
    public static void main(String[] args) {
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        printReverseSortedArray(array);
    }

    /**
     * Creates a copy of the provided array, sorts it in descending order
     * (highest to lowest), and prints the result to the console.
     * <p>
     * This method leaves the original array completely untouched by utilizing
     * an internal array clone before executing an optimized Bubble Sort algorithm.
     * </p>
     *
     * @param array the original array to copy and sort in reverse order
     */
    private static void printReverseSortedArray(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = 0; j < sortedArray.length - 1 - i; j++) {
                if (sortedArray[j + 1] > sortedArray[j]) {
                    int tmp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(sortedArray));
    }
}

