package com.softserve.academy.homeworks.module4;

public class AppMain {
    public static void main(String[] args) {
        System.out.println(YearDaysCalculator.calculateDaysInYear(1234));
        System.out.println(YearDaysCalculator.calculateDaysInYear(333));
        System.out.println(YearDaysCalculator.calculateDaysInYear(1200));
        System.out.println(YearDaysCalculator.calculateDaysInYear(1100));
        System.out.println(YearDaysCalculator.calculateDaysInYear(10));
        System.out.println(YearDaysCalculator.calculateDaysInYear(16));

        CoffeeMachine.displayCoffeeChoice(CoffeeMachine.CoffeeType.CAPPUCCINO);
    }
}
