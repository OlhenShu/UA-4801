package com.softserve.academy.homeworks.module15.task02;

/**
 * Task: Cause a deadlock. Organize the expectations of ending a thread in main(),
 * and make the end of the method main() in this thread.
 */
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
