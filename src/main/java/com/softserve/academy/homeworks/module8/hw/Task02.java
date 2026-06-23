package com.softserve.academy.homeworks.module8.hw;

import java.util.Arrays;
import java.util.Scanner;

    /*
    Create a method readNumber(int start, int end), that read from console integer number
    and return it, if it is in the range [start...end]. If an invalid number or
    non-number text is read, the method should throw an exception.
    Using this method write a method main(), that must enter up to 10 numbers:
	a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100. If user select 100 stop asking for numbers.
	Print all numbers from user
	*/

public class Task02 {

    public static void main(String[] args) {
        int[] numbersFromUser = getInts(0, 100, 10);
        System.out.println(Arrays.toString(numbersFromUser));
    }

    public static int readNumber(int start, int end) throws NumberOutOfRangeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please pick number from " + (start + 1) + " to " + end);
        int number = Integer.parseInt(scanner.nextLine());
        if (number <= start || number > end) {
            throw new NumberOutOfRangeException("Number is not in the range of %d and %d".formatted(start + 1, end));
        }
        return number;
    }

    public static int getNumber(int start, int end) {
        while (true) {
            try {
                return readNumber(start, end);
            } catch (NumberOutOfRangeException | NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static int[] getInts(int rangeStart, int rangeEnd, int numberOfInts) {
        int index = 0;
        int[] numbersFromUser = new int[numberOfInts];
        while (rangeStart <= rangeEnd && index < numberOfInts) {
            numbersFromUser[index] = getNumber(rangeStart, rangeEnd);
            rangeStart = numbersFromUser[index];
            index++;
            if (rangeStart == rangeEnd) {
                break;
            }
        }
        return numbersFromUser;
    }
}
