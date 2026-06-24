package com.softserve.academy.homeworks.module6.task1;

public class NonFlyingBird extends Bird {

    public NonFlyingBird(String feathers, String eggLayingPlace) {
        super(feathers, eggLayingPlace);
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " cannot fly.");
    }
}
