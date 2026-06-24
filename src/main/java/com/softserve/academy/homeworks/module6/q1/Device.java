package com.softserve.academy.homeworks.module6.q1;

/**
 * Represents a generic electronic device, serving as the abstract blueprint
 * for all specialized device subclasses.
 * <p>
 * This class encapsulates common device state (brand, model, power status)
 * and provides concrete behavior to toggle power, while forcing child classes
 * to implement their own custom information display logic.
 * </p>
 */
public abstract class Device {
    protected String brand;
    protected String model;
    protected boolean powerStatus;

    public Device(String brand, String model, boolean powerStatus) {
        this.brand = brand;
        this.model = model;
        this.powerStatus = powerStatus;
    }

    public void turnOn() {
        powerStatus = true;
        System.out.println("The device is now ON.");
    }

    public void turnOff() {
        powerStatus = false;
        System.out.println("The device is now OFF.");
    }

    public abstract void displayInfo();
}
