package com.softserve.academy.module6.comp;

public class Company {
    private String name;
    private Department[] departments;
    private int departmentCount;

    public Company(String name, int capacity) {
        this.name = name;
        this.departments = new Department[capacity];
        this.departmentCount = 0;
    }

    public void addDepartment(Department department) {
        if (departmentCount < departments.length) {
            departments[departmentCount] = department;
            departmentCount++;
            System.out.println("Department " + department.getName() + " added to " + name);
        } else {
            System.out.println("Company has maximum departments!");
        }
    }

    public void displayCompanyStructure() {
        System.out.println("\n!!! Company: " + name + " !!!");
        for (int i = 0; i < departmentCount; i++) {
            departments[i].displayDepartmentInfo();
        }
    }
}