package com.softserve.academy.module6.comp;

public class CompositionExample {
    public static void main(String[] args) {
        // Creating a Company with 2 departments capacity
        Company company = new Company("TechCorp", 2);

        // Creating first Department (IT) with 3 employees capacity
        Department itDepartment = new Department("IT Department", 3);
        itDepartment.addEmployee(new Employee("John Smith", 75000));
        itDepartment.addEmployee(new Employee("Sarah Johnson", 80000));
        itDepartment.addEmployee(new Employee("Mike Davis", 70000));

        // Creating second Department (HR) with 2 employees capacity
        Department hrDepartment = new Department("HR Department", 2);
        hrDepartment.addEmployee(new Employee("Alice Brown", 65000));
        hrDepartment.addEmployee(new Employee("Bob Wilson", 60000));

        // Adding departments to company
        company.addDepartment(itDepartment);
        company.addDepartment(hrDepartment);

        // Display the complete company structure
        company.displayCompanyStructure();

        System.out.println("\n--- Composition Explanation ---");
        System.out.println("In this example:");
        System.out.println("- Company HAS-A Department (strong ownership)");
        System.out.println("- Department HAS-A Employee (strong ownership)");
        System.out.println("- When Company is destroyed, Departments are also destroyed");
        System.out.println("- When Department is destroyed, Employees are also destroyed");
        System.out.println("- This is a COMPOSITION relationship (strong 'has-a')");
    }
}