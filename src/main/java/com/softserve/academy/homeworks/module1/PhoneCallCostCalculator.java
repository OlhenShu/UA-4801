package com.softserve.academy.homeworks.module1;

import java.util.Scanner;

public class PhoneCallCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter price per min for call to US");
        double priceForUSCall = scanner.nextDouble();
        System.out.println("Please enter price per min for call to UK");
        double priceForUKCall = scanner.nextDouble();
        System.out.println("Please enter price per min for call to Ukraine");
        double priceForUACall = scanner.nextDouble();
        System.out.println("Please enter duration for the call to US in minutes");
        double durationUS = scanner.nextDouble();
        System.out.println("Please enter duration for the call to UK in minutes");
        double durationUK = scanner.nextDouble();
        System.out.println("Please enter duration for the call to Ukraine in minutes");
        double durationUA = scanner.nextDouble();
        double costOfUSCall = priceForUSCall * durationUS;
        double costOfUKCall = priceForUKCall * durationUK;
        double costOfUACall = priceForUACall * durationUA;
        System.out.println("Price for the call to US is: " + costOfUSCall);
        System.out.println("Price for the call to UK is: " + costOfUKCall);
        System.out.println("Price for the call to Ukraine is: " + costOfUACall);
        System.out.println("Total cost is: " + (costOfUACall + costOfUKCall + costOfUSCall));
        scanner.close();
    }
}
