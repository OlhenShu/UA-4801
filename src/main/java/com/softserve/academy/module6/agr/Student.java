package com.softserve.academy.module6.agr;

public class Student {
    private String name;
    private int studentId;
    private String major;

    public Student(String name, int studentId, String major) {
        this.name = name;
        this.studentId = studentId;
        this.major = major;
    }

    public void displayInfo() {
        System.out.println("Student: " + name + " (ID: " + studentId + "), Major: " + major);
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getMajor() {
        return major;
    }
}