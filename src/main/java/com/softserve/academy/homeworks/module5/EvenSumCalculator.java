package com.softserve.academy.homeworks.module5;

public class EvenSumCalculator {
    public static void main(String[] args) {
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int evenSum = calculateEvenSum(array);
        System.out.println("The sum of all even numbers in the array: " + evenSum);
    }

    /**
     * Calculates the cumulative total of all even integers within an array.
     * <p>
     * This method uses an enhanced for-loop to inspect every element, isolating
     * even values via a modulo operation and aggregating them into a running sum.
     * </p>
     *
     * @param array the array of integers to evaluate
     * @return the total sum of all even numbers in the array
     */
    public static int calculateEvenSum(int[] array) {
        int evenSum = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                evenSum += i;
            }
        }
        return evenSum;
    }
}
