package com.softserve.academy.homeworks.module5;

public class MaxElementFinder {
    public static void main(String[] args) {
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int maxElement = findMaxElement(array);
        System.out.println("The maximum element in the array: " + maxElement);
    }

    /**
     * Traverses an integer array to find and return its maximum value.
     * <p>
     * This method optimizes performance by assuming the first element is the maximum,
     * then iterating through the remaining elements to update the maximum value
     * whenever a larger integer is encountered.
     * </p>
     *
     * @param array the array of integers to evaluate
     * @return the highest integer value found within the array
     * @throws ArrayIndexOutOfBoundsException if the input array is empty
     */
    public static int findMaxElement(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
