package com.softserve.academy.homeworks.module14.task02;

public class Employee {
    private String name;

    public Employee(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Employee name cannot be null");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
