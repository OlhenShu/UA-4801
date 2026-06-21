package com.softserve.academy.homeworks.module9;

public class StudentRunner {
    public static void main(String[] args) {
        Student student1 = new Student(new Person.FullName("Bob", "Bond"), 19, 3);
        student1.info();
        student1.activity();
        Student student2 = student1.clone();
        student2.setCourseNumber(1);
        student2.getFullName().setFirstName("Alice");
        student1.info();
        student1.activity();
        student2.info();
        student2.activity();
    }
}
