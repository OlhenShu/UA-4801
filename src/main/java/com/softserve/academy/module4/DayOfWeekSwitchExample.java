package com.softserve.academy.module4;

import java.util.Scanner;

public class DayOfWeekSwitchExample {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of the day of week:");
        String dayOfWeek = scanner.nextLine();

        switch (dayOfWeek.toLowerCase()) {
            case "monday":
                System.out.println("The first day of the week");
                break;
            case "tuesday":
                System.out.println("The second day of the week");
                break;
            case "wednesday":
                System.out.println("The third day of the week");
                break;
            case "thursday":
                System.out.println("The fourth day of the week");
                break;
            case "friday":
                System.out.println("The fifth day of the week");
                break;
            case "saturday":
                System.out.println("The sixth day of the week");
                break;
            case "sunday":
                System.out.println("The seventh day of the week");
                break;

            default:
                System.out.println("Invalid day of the week");
        }
    }
}
