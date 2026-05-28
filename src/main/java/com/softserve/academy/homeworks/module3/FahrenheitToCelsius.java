package com.softserve.academy.homeworks.module3;

public class FahrenheitToCelsius {

    public static void main(String[] args) {
        System.out.println(fahrenheitToCelsius(109.0));
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * (5.0 / 9.0);
    }
}
