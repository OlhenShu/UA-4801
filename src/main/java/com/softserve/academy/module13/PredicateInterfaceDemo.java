package com.softserve.academy.module13;

import java.util.List;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateInterfaceDemo {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        IntPredicate isEven = number -> number % 2 == 0;
        Predicate<Integer> isPositive = number -> number > 0;
        System.out.print("Enter a number to test: ");
        int testNumber = scanner.nextInt();
        System.out.println("Is " + testNumber + " even? " + isEven.test(testNumber));
        System.out.println("Is " + testNumber + " positive? " + isPositive.test(testNumber));

        List<String> names = List.of("Alice", "Aaron", "", "Bob", "Charlie", "   ", "David");
        Predicate<String> isNotEmpty = name -> !name.trim().isEmpty();

        for (String name : names) {
            if (isNotEmpty.test(name)) {
                System.out.println("Valid name: " + name);
            } else {
                System.out.println("Invalid name: " + name);
            }
        }
        Predicate<String> startsWithA = name -> name.startsWith("A");
        for (String name : names) {
            if (startsWithA.test(name)) {
                System.out.println(name + " starts with A");
            } else {
                System.out.println(name + " does not start with A");
            }
        }
    }
}