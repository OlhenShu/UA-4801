package com.softserve.academy.module9;

import java.io.IOException;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing index 5: " + numbers[5]);

        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println("Error: Division by zero is not allowed.");
//        } catch (NumberFormatException e) {
//            System.out.println("Error: Number format exception occurred.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access an index that is out of bounds.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Execution completed. This message from the finally block.");
        }
        System.out.println("Program continues after exception handling.");
    }

    public static int divide(int a, int b) {
//        if (b == 0) {
//           System.out.println("Attempting to divide by zero.");
//        }
        return a / b;
    }
}
