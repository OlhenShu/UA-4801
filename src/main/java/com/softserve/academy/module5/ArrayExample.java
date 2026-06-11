package com.softserve.academy.module5;

import com.softserve.academy.module3.Student;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        String[] names = new String[10];
        int[] numbers = new int[5];

        names[0] = "John";
        names[1] = "Jane";
        names[2] = "Alice";
        names[3] = "Tom";
        names[4] = "Sara";
        names[5] = "Mike";
        names[6] = "Emily";
        names[7] = "David";
        names[8] = "Anna";
        names[9] = "Bob";
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name at index " + i + ": " + names[i]);
        }
        for (String val : names) {
            System.out.println("Name: " + val);
        }

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        //numbers[5] = 60; // This will cause an ArrayIndexOutOfBoundsException

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(numbers));
        System.out.println("Length of names array: " + names.length);
        System.out.println("The last name is: " + names[names.length - 1]);
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(Arrays.toString(days));

        Object[] mixed = {"Hello", 123, 45.67, true, 'A'};
        System.out.println(Arrays.toString(mixed));

        Student student1 = new Student("Green", "David", 18, "CS");
        Student[] students = {
                new Student("Green", "Alice", 20, "CS"),
                new Student("Smith", "Bob", 19, "Math"),
                new Student("Johnson", "Charlie", 20, "Physics"),
                student1
        };
        //  Arrays.sort(students);// This will throw a ClassCastException because Student does not implement Comparable
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length - 1; j++) {
                if (students[j].getAge() > students[j + 1].getAge()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        System.out.println("Students sorted by age:");
        System.out.println(Arrays.toString(students));
        System.out.println(Arrays.binarySearch(students, student1)); // This will not work correctly because the array is not sorted according to the natural ordering of Student
        Student key = new Student("?", "?", 20, "?");
        int idx = Arrays.binarySearch(students, key);
        System.out.println("Index of key: " + idx);
    }
}
