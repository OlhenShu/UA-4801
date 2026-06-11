package com.softserve.academy.module4;

import java.util.Scanner;

public class SwitchExample {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("The number is one");
                break;
            case 2:
                System.out.println("The number is two");
              break;
            case 3:
                System.out.println("The number is three");
                break;
            default:
                System.out.println("The number is not one, two or three");
        }
    }
}
