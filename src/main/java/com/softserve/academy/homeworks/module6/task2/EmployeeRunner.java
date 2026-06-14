package com.softserve.academy.homeworks.module6.task2;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Bob", 32, 34_000),
                new Developer("Alice", 37, 45_000, "Junior Java Developer"),
        };
        for (Employee employee : employees) {
            System.out.println(employee.report());
        }
    }
}
