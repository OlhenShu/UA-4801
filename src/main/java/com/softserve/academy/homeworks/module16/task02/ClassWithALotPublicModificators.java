package com.softserve.academy.homeworks.module16.task02;

public class ClassWithALotPublicModificators {
    public static String name;
    public final String firstName;
    public final String lastName;

    public ClassWithALotPublicModificators(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }
    public String getFirstName() {
        return firstName;
    }

    public static void setName(String name) {
        ClassWithALotPublicModificators.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void someMethod() {
        System.out.println("SomeMethod");
        String text = """
                this is public text
                that doesn't
                need
                replacement""";
    }
}
