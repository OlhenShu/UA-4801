package com.softserve.academy.homeworks.module7.task1;

import java.util.Arrays;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee[] employees = {
                new SalariedEmployee("Bob", "12334", "qwee", 6000.0, 40),
                new ContractEmployee("Alice", "234", "sdfsf", 56000.0),
                new ContractEmployee("Tom", "456", "sdfsf", 100.0)
        };
        Arrays.sort(employees);
        for (Employee employee : employees) {
            System.out.println(employee.getInfo());
        }
    }
}
