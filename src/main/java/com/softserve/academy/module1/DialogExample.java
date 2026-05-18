package com.softserve.academy.module1;

import java.util.Scanner;

public class DialogExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "! Welcome to the Java programming world.");
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old.");
        System.out.print("Enter your favorite programming language: ");
        scanner.nextLine(); // Consume the newline left by nextInt()
        String language = scanner.nextLine();
        System.out.println("Your favorite programming language is: " + language);
        System.out.println("Thank you for sharing your information, " + name + "!");
        System.out.println("Goodbye!");
        scanner.close();
    }
}
