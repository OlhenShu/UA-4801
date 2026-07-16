package com.softserve.academy.module15;

public class MyThread extends Thread {
    private int number;
    private int pause;

    public MyThread(int number, int pause) {
        this.number = number;
        this.pause = pause;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + number + " is running, iteration: " + i);
            try {
                Thread.sleep(pause);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new MyThread(1, 100);
        Thread thread2 = new MyThread(2, 300);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Main thread");
    }


}
