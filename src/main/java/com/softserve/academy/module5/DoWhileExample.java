package com.softserve.academy.module5;

import java.util.Scanner;

public class DoWhileExample {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter an integer number:");
        int value = scanner.nextInt();
        do {
            System.out.println("The entered value is: " + value);
            value++;
        } while (value < 5);
        System.out.println("Now the value is: " + value);
        System.out.println("Finished counting!");
//
//        System.out.println("Enter a positive integer number:");
//        int number = scanner.nextInt();
//        do {
//            System.out.println("Number: " + number);
//            number -= 2;
//        } while (number > 0);
//        System.out.println("Finished counting down!");
//        System.out.println("Enter an integer number to print even numbers up to 100:");
//        int i = scanner.nextInt();
//        do {
//            if (i % 2 == 0) {
//                System.out.println("Even number: " + i);
//            }
//            i++;
//        } while (i <= 100);
//        System.out.println("Finished printing even numbers!");
    }
}
