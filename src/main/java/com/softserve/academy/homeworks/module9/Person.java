package com.softserve.academy.homeworks.module9;

/**
 * Represents an abstract blueprint for an individual person with an identity and age.
 * <p>
 * This class implements {@link Cloneable} and performs a deep clone operation
 * to ensure that nested mutable references (like {@link FullName}) are safely
 * duplicated, protecting the original object's integrity.
 * </p>
 */
public abstract class Person implements Cloneable {
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Creates and returns a deep copy of this person instance.
     * <p>
     * This method invokes the shallow cloning process provided by {@code super.clone()}
     * and manually duplicates the underlying {@link FullName} object to decouple
     * the clone from the original instance.
     * </p>
     *
     * @return a distinct, deep-copied instance of this person
     * @throws RuntimeException if the cloning process is not supported
     */
    @Override
    public Person clone() {
        try {
            Person person = (Person) super.clone();
            person.fullName = fullName.clone();
            return person;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Prints a standard textual summary of the person's core attributes to the console.
     */
    public void info() {
        System.out.println("First name: " + fullName.firstName + ", Last name: " +
                fullName.lastName + ", Age: " + age);
    }

    /**
     * Defines the primary daily routine or action associated with this individual.
     * Subclasses must provide their own specific contextual behavior.
     */
    public abstract void activity();

    /**
     * Represents the full name component of an individual.
     * <p>
     * Structured as a static nested class to cleanly encapsulate identity properties
     * directly within the domain context of a {@link Person}.
     * </p>
     */
    public static class FullName implements Cloneable {
        private String firstName;
        private String lastName;

        public FullName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        /**
         * Creates and returns a field-by-field copy of this name component.
         *
         * @return a cloned instance of this FullName profile
         * @throws RuntimeException if the cloning process is not supported
         */
        @Override
        public FullName clone() {
            try {
                return (FullName) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
