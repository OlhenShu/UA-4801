package com.softserve.academy.module6.comp;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Employee: " + name + ", Salary: $" + salary);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}