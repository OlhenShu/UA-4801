package com.softserve.academy.module5;

import java.util.Arrays;
import java.util.Scanner;

public class BreakOperatorExample {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("Enter an integer number:");
//        int count = scanner.nextInt();
//        while (count < 50) {
//            if (count == 30) {
//                System.out.println("Count reached 30, breaking the loop.");
//                break;
//            }
//            System.out.println("Count: " + count);
//            count++;
//        }
//        System.out.println("Finished counting!");

        int[] numbers = {1, -2, 32, 46, -5, 6, 7, 18, 99, 100};

        System.out.println("Enter a target number to search in the array:");
        int target = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Target " + target + " found at position: " + (i + 1));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Target " + target + " not found in the array.");
        }
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Finished searching for target!");
    }
}
