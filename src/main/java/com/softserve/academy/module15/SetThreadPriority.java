package com.softserve.academy.module15;

public class SetThreadPriority extends Thread {
    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " started");
        System.out.println("Thread with priority "
                + Thread.currentThread().getPriority() + " is running");
    }

    public static void main(String[] args) {
        SetThreadPriority t1 = new SetThreadPriority();
        SetThreadPriority t2 = new SetThreadPriority();
        SetThreadPriority t3 = new SetThreadPriority();

        t1.setPriority(MIN_PRIORITY);   // 1
        t2.setPriority(NORM_PRIORITY);  // 5
        t3.setPriority(MAX_PRIORITY);   // 10

        t1.start();
        t2.start();
        t3.start();
    }
}