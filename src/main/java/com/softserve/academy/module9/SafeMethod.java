package com.softserve.academy.module9;

public class SafeMethod {
    public static void main(String[] args) {
        foo(-10);
        System.out.println(foo(25));

    }


    static double safeSqrt(double x) throws ArithmeticException {
        if (x < 0.0) {
            throw new ArithmeticException();
        }
        return Math.sqrt(x);
    }

    static double foo(double a) {
        double result = 0.0;
        try {
            result = safeSqrt(a);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot compute square root of a negative number.");
        }
        return result;
    }
}
