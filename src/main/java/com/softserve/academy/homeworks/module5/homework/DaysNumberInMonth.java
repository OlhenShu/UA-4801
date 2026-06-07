package com.softserve.academy.homeworks.module5.homework;

import java.util.Scanner;

public class DaysNumberInMonth {
    public static final Scanner SCANNER = new Scanner(System.in);

    /**
     * Retrieves the standard number of days in a given month based on its calendar number.
     * This method uses a 1-based index mapping to a static integer array to look up days.
     *
     * @param monthNumber the 1-based index of the month (1 for January, 12 for December)
     * @return the total number of days in the specified month
     * @throws ArrayIndexOutOfBoundsException if the monthNumber is outside the range [1, 12]
     */
    public static int getNumberOfDaysInMonth(int monthNumber) {
        int[] daysInEachMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return daysInEachMonth[monthNumber - 1];
    }

    public static void main(String[] args) {
        //1. Prompt user to enter number of a month
        int monthNumber = 0;
        int count = 0;
        do {
            if (count >= 10) {
                System.out.println("You're really stubborn as you've entered wrong month number 10 times.");
                System.out.println("Next time try to enter number form 1 to 12.");
                System.out.println("See you");
                break;
            }
            System.out.println("Please enter the number of a month");
            monthNumber = SCANNER.nextInt();
            count++;
        } while (monthNumber <= 0 || monthNumber > 12);

        //2. Prints number of days in month
        if (monthNumber != 0) {
            System.out.println("Number of days in month that you've selected: " +
                    getNumberOfDaysInMonth(monthNumber));
        }
    }
}
