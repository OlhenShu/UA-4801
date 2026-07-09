package com.softserve.academy.module11;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

//@Getter
//@Setter
//@AllArgsConstructor
//public class Person {
//    private Long id;
//    private String firstName;
//    private String lastName;
//
//
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(firstName, lastName);
//    }
//}
public record Person(Long id, String firstName, String lastName) {
}
