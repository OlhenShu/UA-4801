package com.softserve.academy.homeworks.module6.q2;

public abstract class Appliance {
    protected String brand;
    protected String model;

    public Appliance(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public abstract void displayInfo();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
