package com.softserve.academy.homeworks.module11.task03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * Manages an internal registry of {@link Student} records.
 * <p>
 * This manager provides utilities to safely add unique students, filter and print
 * student data to the system console, and sort records by demographic properties.
 * </p>
 */
public class StudentsManager {
    private final List<Student> students;

    /**
     * Constructs a new {@code StudentsManager} initialized with an empty student registry.
     */
    public StudentsManager() {
        this.students = new ArrayList<>();
    }

    /**
     * Retrieves the backing mutable list of students.
     *
     * @return the {@link List} containing all currently managed students
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Registers a new student to the manager.
     * <p>
     * This method applies strict validation checks to prevent null elements
     * and duplicate student records inside the collection.
     * </p>
     *
     * @param student the {@link Student} instance to be added; must not be null
     * @throws IllegalArgumentException if the provided student is null, or if an
     * identical student is already registered
     * (determined by the student's {@code equals} method)
     */
    public void addStudent(Student student){
        if (student == null){
            throw new IllegalArgumentException("Student cannot be null");
        }
        if (students.contains(student)){
            throw new IllegalArgumentException("Student is already on the list");
        }
        students.add(student);
    }

    /**
     * Filters and prints the name and course of all students enrolled in a specific course number.
     * <p>
     * Utilizes an {@link Iterator} to manually traverse the underlying collection safely.
     * </p>
     *
     * @param courseNumber the academic course level to filter by
     */
    public void printStudents(int courseNumber) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == courseNumber) {
                System.out.println(student.getName() + " " + student.getCourse());
            }
        }
    }

    /**
     * Prints the name and course of every student currently registered in the manager.
     * <p>
     * Utilizes an {@link Iterator} to manually traverse the collection and output to the console.
     * </p>
     */
    public void printStudents() {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student.getName() + " " + student.getCourse());
        }
    }

    /**
     * Sorts the student list alphabetically (A-to-Z) by their names in-place.
     * <p>
     * Uses an anonymous inner {@link Comparator} class to perform lexicographical
     * comparison on the student names.
     * </p>
     */
    public void sortByName() {
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                return student.getName().compareTo(t1.getName());
            }
        });
    }

    /**
     * Sorts the student list numerically in ascending order by their course levels in-place.
     * <p>
     * Uses an anonymous inner {@link Comparator} class to evaluate primitive course values safely.
     * </p>
     */
    public void sortByCourse() {
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                return Integer.compare(student.getCourse(), t1.getCourse());
            }
        });
    }
}
