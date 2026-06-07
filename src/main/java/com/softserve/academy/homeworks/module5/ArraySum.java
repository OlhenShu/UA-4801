package com.softserve.academy.homeworks.module5;

public class ArraySum {
    public static void main(String[] args) {
        int[] array = {12, -20, 35, 64, -5, -60, 17, 32, 84, 100};
        System.out.println("The sum of the array elements is: " + calculateSum(array));
    }

    /**
     * Calculates the cumulative total of all elements inside an integer array.
     * <p>
     * This method utilizes an optimized enhanced for-loop (for-each) to smoothly
     * traverse the array and aggregate the sum of its values.
     * </p>
     *
     * @param array the array of integers to be summed
     * @return the total sum of all integers in the array
     */
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }
}
