package com.softserve.academy.homeworks.module11.q2;

import java.util.HashSet;
import java.util.Set;

public class AttendanceRegister {
    Set<String> students;

    public AttendanceRegister() {
        students = new HashSet<>();
    }

    public void addStudent(String name) {
        students.add(name);
    }

    public void removeStudent(String name) {
        students.remove(name);
    }

    public boolean isPresent(String name) {
        return students.contains(name);
    }

    public int getTotalStudents() {
        return students.size();
    }
}
