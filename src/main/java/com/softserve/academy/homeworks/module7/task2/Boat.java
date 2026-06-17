package com.softserve.academy.homeworks.module7.task2;

public class Boat extends WaterVehicle {
    private int volume;

    public Boat() {
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    void isSailing() {
        System.out.println("This Boat is sailing");
    }
}
