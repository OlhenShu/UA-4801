package com.softserve.academy.homeworks.module11.task02;

import java.util.*;
import java.util.Map.Entry;

public class Persons {
    private final Map<String, String> persons;

    public Persons() {
        this.persons = new HashMap<>();
    }

    public void addPerson(String lastName, String firstName) {
        if (persons.containsKey(lastName)) {
            throw new IllegalArgumentException("Person with Last Name " + lastName + " is already on the list.");
        }
        persons.put(lastName, firstName);
    }

    public void findPersonsWithFirstName(String name) {
        if (persons.containsValue(name)) {
            System.out.println("List has following people with First Name " + name);
            for (Entry<String, String> entry : persons.entrySet()) {
                if (entry.getValue().equals(name)) {
                    System.out.println(entry.getValue() + " " + entry.getKey());
                }
            }
            return;
        }
        System.out.println("No person with First Name " + name + " on the list.");
    }

    public boolean peopleWithTheSameName() {
        Collection<String> firstNames = persons.values();
        Set<String> uniqueFirstNames = new HashSet<>(firstNames);
        return firstNames.size() != uniqueFirstNames.size();
    }

    public void removePersonWithFirstName(String firstName) {
        Set<String> keys = new HashSet<>(persons.keySet());
        for (String key : keys) {
            if (persons.get(key).equals(firstName)) {
                System.out.println("Person " + firstName + " " + key + " is removed.");
                persons.remove(key);
            }
        }
    }

    public void printData() {
        if (persons.isEmpty()) {
            System.out.println("There are no people on the list.");
            return;
        }
        for (String key : persons.keySet()) {
            System.out.println(key + " " + persons.get(key));
        }
    }
}
