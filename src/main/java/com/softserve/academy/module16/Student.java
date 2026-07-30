package com.softserve.academy.module16;

import java.io.Serializable;

class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    protected static String bachelor;
    private String name;
    private transient String password;
    private int id;

    public Student(String bachelor, int id, String name, String password) {
        Student.bachelor = bachelor;
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public String toString() {
        return "Fac: " + bachelor + ", name: " + name + ", pas: " + password;
    }
}