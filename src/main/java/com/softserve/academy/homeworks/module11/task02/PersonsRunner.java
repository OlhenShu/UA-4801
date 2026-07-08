package com.softserve.academy.homeworks.module11.task02;

public class PersonsRunner {
    public static void main(String[] args) {
        Persons persons = new Persons();
        persons.addPerson("Sivirin", "Bohdan");
//        persons.addPerson("Sivirin", "Yaroslav");
        persons.addPerson("Kos-Sivirin", "Eva");
        persons.addPerson("Vetrova", "Chris");
        persons.addPerson("Vetrov", "Bohdan");
        persons.addPerson("Kos", "Natalia");
        persons.addPerson("Romanovska", "Daria");
        persons.addPerson("Shu", "Lu");
        persons.addPerson("Litvinova", "Svitlana");
        persons.addPerson("Glav", "Tetiana");
        persons.findPersonsWithFirstName("Bohdan");
        System.out.println(persons.peopleWithTheSameName());
        persons.removePersonWithFirstName("Bohdan");
        System.out.println(persons.peopleWithTheSameName());

    }
}
