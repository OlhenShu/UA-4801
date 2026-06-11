package com.softserve.academy.module3;

import static com.softserve.academy.module3.Student.classInfo;

public class StudentDemo {

    public static void main(String[] args) {
        Student student = new Student("Charlie", "Brown");
        Student student2 = new Student("Charlie", "Brown");

        System.out.println(student.equals(student2)); // true
        System.out.println(student == student2); // false

//        student.setFirstName("David");
//        student.setLastName("Johnson");
//        student.setAge(21);
//        student.setCourse("Chemistry");
//        student.displayInfo();
//        System.out.println("-".repeat(10));
//        System.out.println(student.getFirstName());
//        System.out.println(student.getLastName());
//        System.out.println(student.getAge());
//        classInfo();
    //    System.out.println(student);

//
//        Student student1 = new Student();
////        student1.firstName = "";
////        student1.lastName = "";
////        student1.age = 1800000;
////        student1.course = "";
//        Student student2 = new Student("David", "Johnson", 21, "Chemistry");
//        student.displayInfo();
//        System.out.println("-".repeat(10));
//        student1.displayInfo();
//        boolean enrolled = student.isEnrolled();
//        System.out.println("Is the student enrolled? " + enrolled);
//        System.out.println("-".repeat(10));
////        student2.firstName = "Bob";
////        student2.lastName = "Smith";
////        student2.age = 22;
////        student2.course = "Physics";
//        student2.displayInfo();
//        System.out.println("-".repeat(10));
//        System.out.println("Welcome to the Student Management System!");
//        System.out.println("This is a simple Java program to demonstrate basic syntax and structure.");
//        Student student3 = new Student("Eve","Davis", 19, "Biology");
//        student3.displayInfo();
    }

}