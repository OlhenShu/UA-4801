package com.softserve.academy.module3;

public class OverloadExample {
    public static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Method with 2 integer parameters and result: " + result);
        return result;
    }
    public static short sum(short a, short b) {
        short result = (short)(a + b);
        System.out.println("Method with 2 short parameters and result: " + result);
        return result;
    }

    public static double sum(double a, double b) {
        double result = a + b;
        System.out.println("Method with 2 double parameters and result: " + result);
        return result;
    }

    public static int sum(int a, int b, int c) {
        int result = a + b + c;
        System.out.println("Method with 3 integer parameters and result: " + result);
        return result;
    }
    public static double sum(double a, double b, double c) {
        double result = a + b + c;
        System.out.println("Method with 3 double parameters and result: " + result);
        return result;
    }

    public static void main(String[] args) {
        sum(1, 2);
        sum(1.5, 2.5);
        sum(1, 2, 3);
        sum(1.5, 2, 3);
        sum((short)1, (short)2);
    }
}
