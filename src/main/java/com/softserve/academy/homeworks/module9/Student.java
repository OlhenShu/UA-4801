package com.softserve.academy.homeworks.module9;

/**
 * Represents an academic student enrolled at a university, extending
 * the baseline characteristics of a {@link Person}.
 */
public class Student extends Person {
    private int courseNumber;

    public Student(FullName fullName, int age, int courseNumber) {
        super(fullName, age);
        this.courseNumber = courseNumber;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    /**
     * Outputs the student's demographic metrics alongside their current academic status.
     */
    @Override
    public void info() {
        super.info();
        System.out.println("Course number: " + courseNumber);
    }

    /**
     * Logs the primary student activity routine to the console output stream.
     */
    @Override
    public void activity() {
        System.out.println("I study at the university");
    }

    /**
     * Creates and returns a deep copy of this student instance.
     * <p>
     * Utilizes a covariant return type signature to directly deliver a
     * clean {@code Student} variable handle, entirely bypassing the need
     * for manual downstream down-casting by callers.
     * </p>
     *
     * @return a distinct, fully duplicated Student instance
     */
    @Override
    public Student clone() {
        return (Student) super.clone();
    }
}
