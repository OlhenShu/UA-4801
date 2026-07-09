package com.softserve.academy.module11;

public class App {
    public static void main(String[] args) {
        Person person1 = new Person(1L, "John", "Doe");
        Person person2 = new Person(1L, "John", "Doe");

        System.out.println("person1.equals(person2): " + person1.equals(person2));
        System.out.println("person1.hashCode(): " + person1.hashCode());
        System.out.println("person2.hashCode(): " + person2.hashCode());
    }
}
