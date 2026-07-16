package com.softserve.academy.module15;

public class Run2 implements Runnable {
    @Override
    public void run() {
        synchronized (Appl.class) {
            for (int i = 0; i < 10_000; i++) {
                Appl.sum++;
            }
        }
    }
}

class Run1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10_000; i++) {
            synchronized (Appl.class) {
                Appl.sum--;
            }
        }
    }
}


class Appl {
    public static int sum = 0;

    public static void main(String[] args) throws InterruptedException {
        Runnable r1 = new Run1();
        Thread t1 = new Thread(r1);
        Runnable r2 = new Run2();
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Success, sum = " + sum);
    }

    public synchronized void myMethod() {
        //body of the method
    }

    public void myMethod2() {
        synchronized (this) {
            //body of the method
        }
    }
}