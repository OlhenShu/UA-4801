package com.softserve.academy.module3;


import java.util.Objects;

public class Student implements Comparable<Student> {
    private String firstName;
    private String welcomeMessage;
    private String lastName;
    private int age;
    private String course;

    /**
     * Default constructor for Student class.
     * Initializes the student with default values.
     */
    public Student() {
        this.firstName = "Unknown";
        this.lastName = "Unknown";
        this.age = 0;
        this.course = "Undeclared";
    }

    /**
     * Parameterized constructor for Student class.
     * Initializes the student with provided first name and last name.
     *
     * @param firstName The first name of the student.
     * @param lastName  The last name of the student.
     */
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 0; // Default age
        this.course = "Undeclared"; // Default course
    }


    /**
     * Parameterized constructor for Student class.
     * Initializes the student with provided first name, last name, age, and course.
     *
     * @param firstName The first name of the student.
     * @param lastName  The last name of the student.
     * @param age       The age of the student.
     * @param course    The course the student is enrolled in.
     */
    public Student(String firstName, String lastName, int age, String course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.course = course;
    }

    public Student(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.course = "Undeclared"; // Default course
        this.age = age;
    }

    /**
     * Displays the information of the student, including first name, last name, age, and course.
     */
    public void displayInfo() {
        System.out.println("Student lastname: " + lastName);
        System.out.println("Student firstname: " + firstName);
        System.out.println("Student Course: " + course);
        System.out.println("Student Age: " + age);
    }

    /**
     * Checks if the student is enrolled in a course.
     *
     * @return true if the student is enrolled, false otherwise.
     */
    public boolean isEnrolled() {
        //return course != null && !course.isEmpty();
        return true; // Placeholder for actual enrollment logic
    }

    /**
     * Gets the first name of the student.
     *
     * @return A string containing the first name of the student.
     */
    public String getFirstName() {
        return getWelcomeMessage() + firstName;
    }

    private String getWelcomeMessage() {
        return "Dear student, welcome to the course! My firstname is ";
    }

    /**
     * Sets the first name of the student.
     *
     * @param firstName The first name to set for the student.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return "My firstname is " + lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public static void classInfo() {
        System.out.println("Class info: " + Student.class.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    public String toString(String firstName, String lastName) {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.age, o.age);
    }
}
