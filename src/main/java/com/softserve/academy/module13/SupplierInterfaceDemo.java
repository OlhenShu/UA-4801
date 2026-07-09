package com.softserve.academy.module13;

import com.softserve.academy.module11.Person;

import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

public class SupplierInterfaceDemo {
    public static void main(String[] args) {
        // Create a Supplier that returns a random number
        DoubleSupplier randomNumberSupplier = Math::random;

        // Get a random number using the Supplier
        double randomNumber = randomNumberSupplier.getAsDouble();
        System.out.println("Random number: " + randomNumber);

        // Create a Supplier that returns a new StringBuilder instance
        Supplier<StringBuilder> stringBuilderSupplier = StringBuilder::new;

        // Get a new StringBuilder instance using the Supplier
        StringBuilder stringBuilder = stringBuilderSupplier.get();
        stringBuilder.append("Hello, Supplier!");
        System.out.println(stringBuilder);

        Supplier<Long> currentTimeSupplier = System::currentTimeMillis;
        long currentTime = currentTimeSupplier.get();
        System.out.println("Current time in milliseconds: " + currentTime);

        Supplier<Person> personSupplier = () -> new Person(25L,"John", "Brown");
        Person person = personSupplier.get();
        System.out.println("Person: " + person.firstName() + " " + person.lastName() + ", Id: " + person.id());
    }
}
