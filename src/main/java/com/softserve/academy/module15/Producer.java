package com.softserve.academy.module15;

public class Producer implements Runnable {
    Basket basket;
    String[] fruits = {"Apple", "Orange", "Lemon", "Cherry", "Pineapple"};

    public Producer(Basket basket) {
        this.basket = basket;
        new Thread(this, "Producer").start();
    }
    @Override
    public void run() {
        for (int i = 0; i < fruits.length; i++) {
            basket.putFruit(fruits[i]);
        }
    }
}