package com.softserve.academy.homeworks.module15.task03;

/**
 * Task:
 * Create a thread «one», which would start the thread «two», which has to output its number («Thread number two»)
 * 3 times and create thread «three», which would to output message «Thread number three» 5 times.
 */
public class Task03 {
    public static void main(String[] args) {
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread number two");
            }
            Thread t3 = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread number three");
                }
            });
            t3.start();
        });
        Thread t1 = new Thread(t2::start);
        t1.start();
    }
}
