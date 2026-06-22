package com.softserve.academy.module9;

public class CheckExceptionDemo {
    public static void main(String[] args) {
        try {
            printInfo();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void printInfo() throws InterruptedException {
        Thread.sleep(5000); // This line will cause a compilation error because Thread.sleep() throws InterruptedException, which is a checked exception.
        System.out.println("This is a method that can throw a checked exception.");
    }
}
