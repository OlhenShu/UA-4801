package com.softserve.academy.module5;

import java.util.Arrays;

public class ContinueOperatorExample {

    public static void main(String[] args) {

        int[] numbers = {1, -2, 32, 46, -5, 6, 7, 18, 99, 100};
        System.out.println(Arrays.binarySearch(numbers, 32)); // Output: -1 (not found)
        Arrays.sort(numbers);
        System.out.println(Arrays.binarySearch(numbers, 32));

        System.out.println("Sorted array: " + Arrays.toString(numbers));
//        int sum = 0;
//        for (int number : numbers) {
//            if (number < 0) {
//                continue; // Skip negative numbers
//            }
//            sum += number;
//        }
//        System.out.println("Sum of non-negative numbers: " + sum);
//        for (int number : numbers) {
//            if (number % 2 != 0) {
//                continue; // Skip odd numbers
//            }
//            System.out.println("Even number: " + number);
//        }

    }
}
