package com.softserve.academy.module16.crud;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

public class StudentRepository {

    private final List<Student> students = new ArrayList<>();

    public void create(Student student) {
        Objects.requireNonNull(student, "student must not be null");
        if (existsById(student.getId())) {
            throw new IllegalArgumentException("student with id " + student.getId() + " already exists");
        }
        students.add(student);
    }

    public List<Student> findAll() {
        return List.copyOf(students);
    }

    public Student findById(int id) {
        return students.stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("student not found: id=" + id));
    }

    public void update(int id, String newName) {
        Student student = findById(id);
        student.setName(newName);
    }

    /**
     * Видаляє всіх студентів із заданим ім'ям.
     * Навмисно містить класичну помилку ітерації для теми "Дебагінг":
     * після remove(i) наступні елементи зсуваються вліво, а i все одно
     * збільшується, тому один зі збігів "проскакує" без перевірки.
     */
    public void deleteByName(String name) {
        Objects.requireNonNull(name, "name must not be null");
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                students.remove(i);
            }
        }
    }

    private boolean existsById(int id) {
        return students.stream().anyMatch(student -> student.getId() == id);
    }
}
