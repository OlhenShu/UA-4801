package com.softserve.academy.homeworks.module11.task03;

import java.util.ArrayList;
import java.util.List;

public class StudentsRunner {
    public static void main(String[] args) {
        StudentsManager manager = new StudentsManager();
        manager.addStudent(new Student("Sivirin Bohdan", 1));
        manager.addStudent(new Student("Kos-Sivirin Eva", 3));
        manager.addStudent(new Student("Vetrova Chris", 2));
        manager.addStudent(new Student("Shu Lus", 2));
        manager.printStudents(2);
        System.out.println("===============");
        manager.printStudents(5);
        System.out.println("===============");
        manager.printStudents();
        System.out.println("===============");
        manager.sortByCourse();
        manager.printStudents();
        System.out.println("===============");
        manager.sortByName();
        manager.printStudents();

    }
}
