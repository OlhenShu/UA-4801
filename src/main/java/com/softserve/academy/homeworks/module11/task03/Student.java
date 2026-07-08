package com.softserve.academy.homeworks.module11.task03;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        if (name == null){
            throw new IllegalArgumentException("Name can not be null");
        }
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }
}
