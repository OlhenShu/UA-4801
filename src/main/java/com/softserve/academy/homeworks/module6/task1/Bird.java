package com.softserve.academy.homeworks.module6.task1;

public abstract class Bird {
    private String feathers;
    private String eggLayingPlace;

    public Bird(String feathers, String eggLayingPlace) {
        this.feathers = feathers;
        this.eggLayingPlace = eggLayingPlace;
    }

    public abstract void fly();

    public String getFeathers() {
        return feathers;
    }

    public String getEggLayingPlace() {
        return eggLayingPlace;
    }
}
