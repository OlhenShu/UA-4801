package com.softserve.academy.homeworks.module11.task03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentsManagerTest {
    private static StudentsManager studentsManager;
    private final Student student1 = new Student("Sivirin Bohdan", 1);
    private final Student student2 = new Student("Kos-Sivirin Eva", 3);
    private final Student student3 = new Student("Vetrova Chris", 2);
    private final Student student4 = new Student("Shu Lus", 2);

    @BeforeEach
     void beforeEach() {
        studentsManager = new StudentsManager();
        studentsManager.addStudent(student1);
        studentsManager.addStudent(student2);
        studentsManager.addStudent(student3);
        studentsManager.addStudent(student4);
    }

    @Test
    void sortingOfStudentsByName() {
        studentsManager.sortByName();
        assertEquals(2, studentsManager.getStudents().indexOf(student1));
        assertEquals(0, studentsManager.getStudents().indexOf(student2));
        assertEquals(3, studentsManager.getStudents().indexOf(student3));
        assertEquals(1, studentsManager.getStudents().indexOf(student4));
    }

    @Test
    void sortingOfStudentsByCourse(){
        studentsManager.sortByCourse();
        assertEquals(0, studentsManager.getStudents().indexOf(student1));
        assertEquals(3, studentsManager.getStudents().indexOf(student2));
        assertEquals(1, studentsManager.getStudents().indexOf(student3));
        assertEquals(2, studentsManager.getStudents().indexOf(student4));
    }

    @Test
    void addNullStudent(){
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> studentsManager.addStudent(null));
        String expectedMessage = "Student cannot be null";
        assertEquals(expectedMessage, e.getMessage());
    }
    @Test
    void addSameStudent(){
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> studentsManager.addStudent(student1));
        String expectedMessage = "Student is already on the list";
        assertEquals(expectedMessage, e.getMessage());
    }

    @Test
    void addNewStudent(){
        Student student5 = new Student("New Student", 6);
        studentsManager.addStudent(student5);
        assertEquals(student5, studentsManager.getStudents().getLast());
    }

    //todo: after learning io add tests for printStudents methods
}