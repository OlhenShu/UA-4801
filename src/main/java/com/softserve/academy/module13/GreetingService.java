package com.softserve.academy.module13;

@FunctionalInterface
public interface GreetingService {
    String greet(String message);

    default int sumTwoNumbers(int a, int b) {
        return a + b;
    }
}
