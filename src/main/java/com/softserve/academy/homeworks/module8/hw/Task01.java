package com.softserve.academy.homeworks.module8.hw;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Task01 {
    public static double div(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        double number1 = readDouble("Enter 1st number");
        double number2 = readDouble("Enter 2nd number");
        System.out.println(div(number1, number2));

    }

    public static double readDouble(String prompt) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println(prompt);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException | NoSuchElementException e) {
                System.out.println(e.getMessage());
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
                System.out.println("Scanner is closed.");
            }
        }
    }
}
