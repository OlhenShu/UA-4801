package com.softserve.academy.homeworks.module7.task2;

public class Motorcycle extends GroundVehicle {
    private int maxSpeed;

    public Motorcycle() {
    }

    @Override
    void drive() {
        System.out.println("This Motorcycle is on the road.");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
