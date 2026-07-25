package com.softserve.academy.homeworks.module12.task04;

import java.util.Random;
import java.util.Scanner;

public class UserGreeting {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static String firstName;
    public static String lastName;
    public static String[] greetings;

    public static void fillGreetings() {
        greetings = new String[5];
        greetings[0] = "Hi %s %s. Welcome!";
        greetings[1] = "Hello dear %s %s. We're happy you joined!";
        greetings[2] = "Welcome %s %s!";
        greetings[3] = "Chiao %s %s my friend!";
        greetings[4] = "%s %s. What a surprise!";
    }

    public static void getFirstAndLastName() {
        String firstAndLastName = "";
        while (!firstAndLastName.matches("^[a-zA-Z]+(-[a-zA-Z]+)?\\s+[a-zA-Z]+(-[a-zA-Z]+)?$")) {
            System.out.println("Please enter your first name and last name:");
            firstAndLastName = SCANNER.nextLine();
        }
        String[] fAndLNames = firstAndLastName.split(" ");
        firstName = fAndLNames[0];
        lastName = fAndLNames[1];
    }

    public static void printGreeting() {
        fillGreetings();
        Random random = new Random();
        System.out.printf(greetings[random.nextInt(0, 5)], firstName, lastName);
    }

    public static void main(String[] args) {
        getFirstAndLastName();
        printGreeting();
    }
}
