package com.softserve.academy.homeworks.module3;

import java.util.Locale;

public class TestingMethods {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Person p1 = new Person("Bohdan", "Sivirin");
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        Person p5 = new Person();
        p2.input();
        p3.input();
        p4.input();
        p5.input();
        p1.output();
        p2.output();
        p3.output();
        p4.output();
        p5.output();
    }
}
