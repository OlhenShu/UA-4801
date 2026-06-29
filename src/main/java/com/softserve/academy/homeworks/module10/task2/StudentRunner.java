package com.softserve.academy.homeworks.module10.task2;

import java.util.ArrayList;
import java.util.List;

public class StudentRunner {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        studentManager.add(new Student("Bob", "12-2026", 3, new ArrayList<>(List.of(3, 3, 2, 3, 3))));
        studentManager.add(new Student("Alice", "12-2026", 3, new ArrayList<>(List.of(3, 3, 3, 3, 3))));
        studentManager.add(new Student("Eva", "12-2026", 3, new ArrayList<>(List.of(4, 5, 4, 3, 5))));
        studentManager.add(new Student("Chris", "12-2026", 3, new ArrayList<>(List.of(5, 5, 2, 3, 5))));
        studentManager.printStudents(3);
        System.out.println("=============");
        studentManager.promoteToTheNextCourse();
        studentManager.printStudents(3);
        System.out.println("=============");
        studentManager.printStudents(4);
    }
}
