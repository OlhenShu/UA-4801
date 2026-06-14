package com.softserve.academy.homeworks.module6.task1;

public class BirdsRunner {
    public static void main(String[] args) {
        Bird[] birds = {
                new Eagle("Brown", "In the mountains"),
                new Penguin("Black", "On the ground"),
                new Kiwi("Brown", "In the forest"),
                new Eagle("Brown", "In the mountains"),
                new Swallow("Black", "On the rock"),
                new Penguin("Black", "On the ground"),
                new Swallow("Black", "On the rock"),
                new Penguin("Black", "On the ground"),
        };
        for (Bird bird : birds) {
            bird.fly();
        }
    }
}
