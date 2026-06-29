package com.softserve.academy.homeworks.module10.task2;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students = new ArrayList<>();

    public boolean add(Student student) {
        if (students.contains(student)) {
            return false;
        }
        return students.add(student);
    }

    public void promoteToTheNextCourse() {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAverageGrade() < 3.0) {
                students.remove(i);
                i--;
            } else {
                int curse = students.get(i).getCourse();
                students.get(i).setCourse(curse + 1);
            }
        }
    }

    public void printStudents(int courseNumber) {
        for (Student student : students) {
            if (student.getCourse() == courseNumber) {
                System.out.println(student);
            }
        }
    }
}
