package com.softserve.academy.homeworks.module7.task2;

public class Helicopter extends FlyingVehicle {
    private int weight;
    private int maxHeight;

    public Helicopter() {
    }

    @Override
    void fly() {
        System.out.println("This Helicopter is flying.");
    }

    @Override
    void land() {
        System.out.println("This Helicopter is landing.");
    }
}
