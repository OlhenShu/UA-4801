package com.softserve.academy.module6.agr;

public class AggregationExample {
    public static void main(String[] args) {
        // Creating a University with 5 student capacity
        University university = new University("State University", 5);

        // Creating students independently (they can exist without the university)
        Student student1 = new Student("Alex Brown", 1001, "Computer Science");
        Student student2 = new Student("Emma Wilson", 1002, "Business Administration");
        Student student3 = new Student("David Miller", 1003, "Engineering");
        Student student4 = new Student("Lisa Anderson", 1004, "Medicine");

        // Enrolling students to the university
        university.enrollStudent(student1);
        university.enrollStudent(student2);
        university.enrollStudent(student3);
        university.enrollStudent(student4);

        // Display university information
        university.displayUniversityInfo();

        // Student can exist independently of the university
        System.out.println("\n--- Student Independent Existence ---");
        System.out.println("Creating a student outside the university:");
        Student student5 = new Student("Tom Garcia", 1005, "Law");
        student5.displayInfo();

        System.out.println("\n--- Aggregation Explanation ---");
        System.out.println("In this example:");
        System.out.println("- University HAS-A Student (weak ownership)");
        System.out.println("- Student can exist without University");
        System.out.println("- University can exist without specific Students");
        System.out.println("- Students can be removed and still exist independently");
        System.out.println("- This is an AGGREGATION relationship (weak 'has-a')");
    }
}