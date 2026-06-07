package com.softserve.academy.homeworks.module5.homework.carsTask;

/**
 * Represents a vehicle entity within the system, encapsulating its
 * structural type, manufacturing timeline, and mechanical specifications.
 * <p>
 * This class follows standard encapsulation principles by keeping its fields
 * private, preparing it for getter and setter methods.
 * </p>
 */
public class Car {
    /**
     * The body style classification of the vehicle (e.g., SEDAN, VAN).
     */
    private CarTypes type;

    /**
     * The manufacturing year of the vehicle.
     */
    private int yearOfProduction;

    /**
     * The engine displacement volume, typically measured in liters (e.g., 2.0).
     */
    private double engineCapacity;

    public Car(CarTypes type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public CarTypes getType() {
        return type;
    }

    public void setType(CarTypes type) {
        this.type = type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car " +
                "with type " + type +
                ", yearOfProduction " + yearOfProduction +
                ", engineCapacity " + engineCapacity;
    }
}
