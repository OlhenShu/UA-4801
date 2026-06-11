package com.softserve.academy.module5;

import java.util.Scanner;

public class WhileExample {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter an integer number:");
        int count = scanner.nextInt();
        while (count < 50) {
            System.out.println("Count: " + count);
            count++;
        }
        System.out.println("Finished counting!");
        System.out.println("Enter a positive integer number:");
        int number = scanner.nextInt();
        while (number > 0) {
            System.out.println("Number: " + number);
            number -= 2;
        }
        System.out.println("Finished counting down!");
        System.out.println("Enter an integer number to print even numbers up to 100:");
        int i = scanner.nextInt();
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println("Even number: " + i);
            }
            i++;
        }
        System.out.println("Finished printing even numbers!");
    }
}
