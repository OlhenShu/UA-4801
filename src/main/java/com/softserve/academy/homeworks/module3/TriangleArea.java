package com.softserve.academy.homeworks.module3;

import java.util.Scanner;

public class TriangleArea {
    /**
     * Calculates the area of a triangle using Heron's Formula based on three side lengths.
     *
     * @param side1 the length of the first side
     * @param side2 the length of the second side
     * @param side3 the length of the third side
     * @return the calculated area of the triangle as a double
     */
    public static double triangleArea(double side1, double side2, double side3) {
        double semiPerimeter = (side1 + side2 + side3) / 2;
        double triangleArea = Math.sqrt(
                semiPerimeter * (semiPerimeter - side1) *
                        (semiPerimeter - side2) * (semiPerimeter - side3)
        );
        return triangleArea;
    }

    /**
     * Checks whether a triangle can physically exist with the given side lengths.
     * This method applies the Triangle Inequality Theorem by verifying if the sum
     * of the two shorter sides is strictly greater than the longest side.
     *
     * @param side1 the length of the first side
     * @param side2 the length of the second side
     * @param side3 the length of the third side
     * @return true if the sides can form a valid triangle; false otherwise
     */
    public static boolean isTriangleExists(double side1, double side2, double side3){
        double longestSide = Math.max(side1, Math.max(side2, side3));
        double sumOfSmallerSides = side1 + side2 + side3 - longestSide;
        return true; //placeholder
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Side 1");
        double side1 = scanner.nextDouble();
        System.out.println("Please enter Side 2");
        double side2 = scanner.nextDouble();
        System.out.println("Please enter Side 3");
        double side3 = scanner.nextDouble();
        //todo: add check if triangle exists
        System.out.println(triangleArea(side1, side2, side3));
        scanner.close();
    }
}
