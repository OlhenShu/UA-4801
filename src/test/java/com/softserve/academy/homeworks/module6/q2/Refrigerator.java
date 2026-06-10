package com.softserve.academy.homeworks.module6.q2;

public class Refrigerator extends Appliance {
    private int capacity;

    public Refrigerator(String brand, String model, int capacity) {
        super(brand, model);
        this.capacity = capacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Refrigerator - Brand: " + brand + ", Model: " + model +
                ", Capacity: " + capacity + " liters");
    }
}
