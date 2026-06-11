package com.softserve.academy.module4;

public class ConditionalOperatorsDemo {
    public static void main(String[] args) {
        int t = 5;
        int s = 4;
        int v = 7;
        System.out.println((t > s) && (t > v) || (s < v));
        System.out.println((t > s) || (t > v) && (s > v));
        System.out.println((t > s || t > v) && (s > v));
    }
}
