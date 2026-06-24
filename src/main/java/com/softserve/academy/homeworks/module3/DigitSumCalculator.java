package com.softserve.academy.homeworks.module3;

public class DigitSumCalculator {
    public static int calculateDigitSum(int number) {
        if (number >= 100 && number <= 999) {
            int digit1 = number / 100;
            int digit2 = (number - digit1 * 100) / 10;
            int digit3 = number - digit1 * 100 - digit2 * 10;
            return digit1 + digit2 + digit3;
        } else {
            // Handle the error if the number is not three digits
            throw new IllegalArgumentException("The input number is not a three-digit number.");
        }
    }

    public static void main(String[] args) {
        System.out.println(calculateDigitSum(123));
        System.out.println(calculateDigitSum(111));
        System.out.println(calculateDigitSum(999));
        System.out.println(calculateDigitSum(345));
    }
}
