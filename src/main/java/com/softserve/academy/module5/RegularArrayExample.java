package com.softserve.academy.module5;

import java.util.Arrays;

public class RegularArrayExample {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Element at [1][2]: " + matrix[1][2]); // Output: 6
        System.out.println("Length of matrix: " + matrix.length); // Output: 3
        System.out.println("Matrix:" + Arrays.deepToString(matrix));

        String[][] words = new String[2][3];
        words[0][0] = "Hello";
        words[0][1] = "World";
        words[0][2] = "!";
        // words[0][3] = "!";
        words[1][0] = "Java";
        words[1][1] = "Programming";
        words[1][2] = "Language";
        System.out.println("Words matrix: " + Arrays.deepToString(words));

        String[][] names = {
                {"John", "Jane"},
                {"Tom"},
                {"Emily", "David", "Anna"}
        };
        System.out.println("Names matrix: " + Arrays.deepToString(names));
           /* for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }*/
    }
}
