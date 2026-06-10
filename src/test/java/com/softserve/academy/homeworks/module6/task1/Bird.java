package com.softserve.academy.homeworks.module6.task1;

public abstract class Bird {
    private String feathers;
    private String layEggs;

    public Bird(String feathers, String layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();

    public String getFeathers() {
        return feathers;
    }

    public String isLayEggs() {
        return layEggs;
    }
}
