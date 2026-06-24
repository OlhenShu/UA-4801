package com.softserve.academy.homeworks.module4;

public class CoffeeMachine {
    public enum CoffeeType {
        ESPRESSO, AMERICANO, CAPPUCCINO, LATTE
    }

    public static void displayCoffeeChoice(CoffeeType coffeeType){
        String messageToPrint = switch(coffeeType){
            case ESPRESSO -> "You have chosen Espresso. Enjoy your strong coffee!";
            case AMERICANO -> "You have chosen Americano. Enjoy your smooth coffee!";
            case CAPPUCCINO -> "You have chosen Cappuccino. Enjoy your coffee with milk foam!";
            case LATTE -> "You have chosen Latte. Enjoy your creamy coffee!";
            default -> "No such coffee type";
        };
        System.out.println(messageToPrint);
    }
}
