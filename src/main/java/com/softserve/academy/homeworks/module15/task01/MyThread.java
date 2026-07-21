package com.softserve.academy.homeworks.module15.task01;

import java.time.Duration;

public class MyThread implements Runnable {
    String message;

    public MyThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
            try {
                Thread.sleep(Duration.ofSeconds(1));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
