package com.softserve.academy.module7;

import java.util.Arrays;

public record Student(String fullName, int age, String major) implements Comparable<Student> {
    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", major='" + major + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.fullName.compareTo(o.fullName);
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Alice Johnson", 20, "Computer Science");
        Student student2 = new Student("Alice Asmith", 22, "Mathematics");

        System.out.println(student1);
        System.out.println(student2);

        //  Accessing individual fields
        System.out.println("Student 1 Name: " + student1.fullName());
        System.out.println("Student 1 Age: " + student1.age());
        System.out.println("Student 1 Major: " + student1.major());

        Student[] students =
                new Student[]{student1, student2};

        Arrays.sort(students);
        System.out.println("Sorted Students: " + Arrays.toString(students));

        Arrays.sort(students, new AgeNameComparator());
        System.out.println("Sorted by Age and Name: " + Arrays.toString(students));
    }
}