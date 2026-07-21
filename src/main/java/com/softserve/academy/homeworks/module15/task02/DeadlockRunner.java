package com.softserve.academy.homeworks.module15.task02;

public class DeadlockRunner {
    public static void main(String[] args) throws InterruptedException {
        var mainTread = Thread.currentThread();
        var thread1 = new Thread(() -> {
            try {
                mainTread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        thread1.start();
        thread1.join();
    }
}
