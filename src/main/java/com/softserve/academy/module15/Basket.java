package com.softserve.academy.module15;

public class Basket {
    private String fruit;
    private volatile boolean fruitIsAvailable = false;

    public synchronized String getFruit() {
        while (!fruitIsAvailable) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Get: " + fruit);
        fruitIsAvailable = false;
        notifyAll();
        return fruit;
    }

    public synchronized void putFruit(String fruit) {
        while (fruitIsAvailable) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.fruit = fruit;
        System.out.println("Put: " + fruit);
        fruitIsAvailable = true;
        notifyAll();
    }
}