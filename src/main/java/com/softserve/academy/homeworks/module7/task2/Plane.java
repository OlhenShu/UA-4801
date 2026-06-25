package com.softserve.academy.homeworks.module7.task2;

public class Plane extends FlyingVehicle {
    private int maxDistance;

    public Plane() {
    }

    @Override
    void fly() {
        System.out.println("The Plane is flying.");
    }

    @Override
    void land() {
        System.out.println("The Plane is landing.");
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
