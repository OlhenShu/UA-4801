package com.softserve.academy.homeworks.module4;

public class AgeChecker {
    public static String checkIfAdult(int age) {
        if (age <= 0) {
            return "Invalid age. Age must be a positive number.";
        } else if (age > 150) {
            return "Invalid age. Age must not exceed 150 years.";
        } else if (age >= 18 && age <= 150) {
            return "You are an adult.";
        } else {
            return "You are not an adult.";
        }
    }
}
