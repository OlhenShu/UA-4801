package com.softserve.academy.homeworks.module15.task01;

import java.time.Duration;

/**
 * Task:
 * Run three threads and output there different messages for 5 times.
 * The third thread supposed to start after finishing working of the two previous threads.
 */
public class Task01 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyThread("Message 1"));
        Thread t2 = new Thread(new MyThread("Message 2"));
        Thread t3 = new Thread(() ->{
            try {
                t1.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                t2.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("Message 3");
                try {
                    Thread.sleep(Duration.ofSeconds(1));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
