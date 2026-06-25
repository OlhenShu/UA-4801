package com.softserve.academy.homeworks.module7.task2;

public class Bus extends GroundVehicle {
    private String route;

    public Bus() {
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    void drive() {
        System.out.println("The Bus is on its way.");
    }
}
