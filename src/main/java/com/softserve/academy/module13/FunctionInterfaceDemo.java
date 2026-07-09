package com.softserve.academy.module13;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;

public class FunctionInterfaceDemo {
    public static void main(String[] args) {
        IntUnaryOperator squareFunction = x -> x * x;
        int number = 5;
        int squared = squareFunction.applyAsInt(number);
        System.out.println("The square of " + number + " is: " + squared);

        // Create a Function that takes a String and returns its length
        Function<String, Integer> lengthFunction = String::length;

        String testString = "Hello, World!";
        int length = lengthFunction.apply(testString);
        System.out.println("The length of \"" + testString + "\" is: " + length);

        BiFunction<Integer, Integer, Integer> addFunction = (a, b) -> a + b;
        int a = 10;
        int b = 20;
        int sum = addFunction.apply(a, b);
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);

        BinaryOperator<Integer> multiplyFunction = (x, y) -> x * y;
        int x = 4;
        int y = 5;
        int product = multiplyFunction.apply(x, y);
        System.out.println("The product of " + x + " and " + y + "  is: " + product);
    }
}
