package com.softserve.academy.homeworks.module7.task2;

public class Liner extends WaterVehicle {
    private int floors;

    public Liner() {
    }

    @Override
    void sail() {
        System.out.println("The Liner is sailing.");
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
