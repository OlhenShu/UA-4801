package com.softserve.academy.module6.agr;

public class University {
    private String name;
    private Student[] students;
    private int studentCount;

    public University(String name, int capacity) {
        this.name = name;
        this.students = new Student[capacity];
        this.studentCount = 0;
    }

    public void enrollStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount] = student;
            studentCount++;
            System.out.println("Student " + student.getName() + " enrolled at " + name);
        } else {
            System.out.println("University is at full capacity!");
        }
    }

    public void removeStudent(int index) {
        if (index >= 0 && index < studentCount) {
            System.out.println("Student " + students[index].getName() + " removed from " + name);
            // Shift array elements
            for (int i = index; i < studentCount - 1; i++) {
                students[i] = students[i + 1];
            }
            students[studentCount - 1] = null;
            studentCount--;
        }
    }

    public void displayUniversityInfo() {
        System.out.println("\n=== University: " + name + " ===");
        System.out.println("Total Students: " + studentCount);
        for (int i = 0; i < studentCount; i++) {
            students[i].displayInfo();
        }
    }

    public String getName() {
        return name;
    }
}