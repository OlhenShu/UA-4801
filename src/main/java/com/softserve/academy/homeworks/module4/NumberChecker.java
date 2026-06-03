package com.softserve.academy.homeworks.module4;

public class NumberChecker {
    public static String checkNumberInRangeAndParity(int number, int lowerBound, int upperBound) {
        if (lowerBound >= upperBound) {
            return "Not valid range";
        } else if (number < lowerBound || number > upperBound) {
            return "The number " + number + " is out of the range [" + lowerBound + " " + upperBound + "].";
        } else {
            if (number % 2 == 0) {
                return "The number " + number + " is within the range and is even.";
            } else {
                return "The number " + number + " is within the range and is odd.";
            }
        }
    }
}
