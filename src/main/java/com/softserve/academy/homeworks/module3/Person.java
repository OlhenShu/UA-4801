package com.softserve.academy.homeworks.module3;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    public static final Scanner SCANNER = new Scanner(System.in);
    private static final int OLDEST_YEAR = 150;
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
        this("N/A", "N/A");
    }

    public Person(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    public int getAge() throws Exception {
        if (birthYear == 0) {
            throw new Exception("Birth Year was not set");
        }
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
        try {
            System.out.println("Age: " + getAge());
        }catch (Exception e){
            System.out.println("Age was not set for this person.");
        }
    }

    public void changeName(String fn, String ln) {
        setFirstName(fn);
        setLastName(ln);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.isBlank()){
            throw new IllegalArgumentException("First Name cannot be null");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.isBlank()){
            throw new IllegalArgumentException("Last Name cannot be null");
        }
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        if (birthYear <= LocalDate.now().getYear() - OLDEST_YEAR || birthYear > LocalDate.now().getYear()) {
            throw new IllegalArgumentException("Birth year cannot be before " +
                    (LocalDate.now().getYear() - OLDEST_YEAR) + " or in the future");
        }
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
