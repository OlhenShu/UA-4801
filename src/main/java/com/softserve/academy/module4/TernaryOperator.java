package com.softserve.academy.module4;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int max = (a > b) ? a : b;
        System.out.println("Max value is: " + max);

        String result = (b % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number " + b + " is: " + result);

        int t = 5;
        int s = 4;
        String comparisonResult = (t >= ++s) ? "t is greater or = than s" : "t is not greater than s";
        System.out.println(comparisonResult);

        int c = 7;
        int d = 6;
        String comparisonResult2 = (c-- == d) ? "c is equal to d" : "c is not equal to d";
        System.out.println(comparisonResult2);
    }
}
