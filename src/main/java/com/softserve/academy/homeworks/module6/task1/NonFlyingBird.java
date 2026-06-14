package com.softserve.academy.homeworks.module6.task1;

public class NonFlyingBird extends Bird {

    public NonFlyingBird(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " can not fly.");
    }
}
