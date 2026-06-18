package com.softserve.academy.module6.comp;

public class Department {
    private String name;
    private Employee[] employees;
    private int employeeCount;

    public Department(String name, int capacity) {
        this.name = name;
        this.employees = new Employee[capacity];
        this.employeeCount = 0;
    }

    public void addEmployee(Employee employee) {
        if (employeeCount < employees.length) {
            employees[employeeCount] = employee;
            employeeCount++;
            System.out.println("Employee " + employee.getName() + " added to " + name);
        } else {
            System.out.println("Department is full!");
        }
    }

    public void displayDepartmentInfo() {
        System.out.println("\n=== Department: " + name + " ===");
        for (int i = 0; i < employeeCount; i++) {
            employees[i].displayInfo();
        }
    }

    public String getName() {
        return name;
    }
}