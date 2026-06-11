package com.softserve.academy.module4;

public class Example {
    public static void main(String[] args) {
        int a = 57;
        int b = 24;
        if (a > 50 || (b = 72) < 50) {
            System.out.println("Do something...");
        }
        System.out.println("Sum for a and b is: " + (a + b));
        System.out.println("Variable 'a' = " + a);
        System.out.println("Variable 'b' = " + b);
        System.out.println("Result of (a > 50 || (b = 72) < 50) is: " + (a > 50 || (b = 72) < 50));

        int c = 37;
        int d = 24;
        if (c > 50 & (d = 72) < 50) {
            System.out.println("Do something...");
        }
        System.out.println("Sum for c and d is: " + (c + d));
        System.out.println("Variable 'c' = " + c);
        System.out.println("Variable 'd' = " + d);
        System.out.println("Result of (c > 50 || (d = 72) < 50) is: " + (c > 50 && (d = 72) < 50));
    }
}
