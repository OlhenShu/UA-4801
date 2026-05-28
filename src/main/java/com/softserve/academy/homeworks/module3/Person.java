package com.softserve.academy.homeworks.module3;

import java.time.LocalDate;

import static com.softserve.academy.homeworks.module3.TestingMethods.SCANNER;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
        this("N/A", "N/A");
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        //todo: add verification if birthYear not 0
        return LocalDate.now().getYear() - birthYear;
    }

    public void input() {
        System.out.println("Please enter first name:");
        String firstName = SCANNER.nextLine();
        setFirstName(firstName);
        System.out.println("Please enter last name:");
        String lastName = SCANNER.nextLine();
        setLastName(lastName);
        System.out.println("Please enter year of birth");
        int birthYear = (SCANNER.nextInt());
        setBirthYear(birthYear);
        SCANNER.nextLine();
    }

    public void output() {
        System.out.println("First name: " + getFirstName());
        System.out.println("Last name: " + getLastName());
        System.out.println("Year of birth: " + getBirthYear());
        System.out.println("Age: " + getAge());
    }

    public void changeName(String fn, String ln) {
        firstName = fn;
        lastName = ln; //todo: add verification if it's null
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
