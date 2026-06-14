package com.softserve.academy.homeworks.module6.q2;

public class WashingMachine extends Appliance {
    private int loadCapacity;

    public WashingMachine(String brand, String model, int loadCapacity) {
        super(brand, model);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Washing Machine - Brand: " + brand + ", Model: " + model +
                ", Load Capacity: " + loadCapacity + " kg");
    }
}
