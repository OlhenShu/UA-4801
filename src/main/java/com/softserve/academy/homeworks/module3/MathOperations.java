package com.softserve.academy.homeworks.module3;

public class MathOperations {

    public static double calculateSquareRoot(double number) {
        return Math.sqrt(number);
    }

    public static double calculateSquare(double number) {
        return number * number;
    }

    public static double calculateCub(double number) {
        return number * number * number;
    }

    public static void main(String[] args) {
        System.out.println(calculateSquareRoot(9));
        System.out.println(calculateSquare(3));
        System.out.println(calculateCub(3));
    }
}
