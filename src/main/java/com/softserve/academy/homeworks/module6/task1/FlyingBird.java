package com.softserve.academy.homeworks.module6.task1;

public class FlyingBird extends Bird {

    public FlyingBird(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying.");
    }
}
