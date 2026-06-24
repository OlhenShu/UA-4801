package com.softserve.academy.homeworks.module6.task2;

public class Developer extends Employee {
    private String position;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d years, Position: %s, Salary: ₴%.2f.",
                getName(), getAge(), position, getSalary());
    }
}
