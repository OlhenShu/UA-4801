package com.softserve.academy.homeworks.module14.task02;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeRunner {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("Bob"),
                new Employee("Alice"),
                new Employee("Eva"),
                new Employee("Bob"),
                new Employee("Bob"),
                new Employee("Eva"),
                new Employee("Alice"),
                new Employee("Alice")
        ));

        Optional<String> mostPopularName = getMostPopularName(employees);
        System.out.println(mostPopularName);
    }

    private static Optional<String> getMostPopularName(List<Employee> employees) {
        if (employees == null || employees.isEmpty()) {
            return Optional.empty();
        }
        return employees.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.counting()))
                .entrySet().stream()
                .max(Comparator.comparingLong(Map.Entry::getValue))
                .map(Map.Entry::getKey);
    }
}
