package com.softserve.academy.homeworks.module10.q3;

import java.util.*;

public class PersonMerger {
    public static List<Person> mergeAndSortPersons(List<Person> list1, List<Person> list2) {
        List<Person> mergedList = new ArrayList<>();
        if (list1 != null) {
            addPersonToListWithoutDuplicates(list1, mergedList);
        }
        if (list2 != null) {
            addPersonToListWithoutDuplicates(list2, mergedList);
        }
        if (!mergedList.isEmpty()){
            sortPersonsByAge(mergedList);
        }
        return mergedList;
    }

    private static void sortPersonsByAge(List<Person> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j).getAge() > list.get(j + 1).getAge()) {
                    Person buffer = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, buffer);
                }
            }
        }
    }

    private static void addPersonToListWithoutDuplicates(List<Person> originalList, List<Person> targetList) {
        if (originalList.isEmpty()){
            return;
        }
        for (Person person : originalList) {
            if (!isPersonInTheList(person, targetList)) {
                targetList.add(person);
            }
        }
    }

    private static boolean isPersonInTheList(Person person, List<Person> list) {
        return list.contains(person);
    }

    public static List<Person> filterByMinimumAge(List<Person> persons, int minAge) {
        List<Person> filteredList = new ArrayList<>();
        if (persons == null || persons.isEmpty()) {
            return filteredList;
        }
        for (Person person : persons) {
            if (person.getAge() >= minAge) {
                filteredList.add(person);
            }
        }
        return filteredList;
    }

    public static double calculateAverageAge(List<Person> persons) {
        double sumOfAllAges = 0;
        if (persons == null || persons.isEmpty()) {
            return 0;
        }
        for (Person person : persons) {
            sumOfAllAges += person.getAge();
        }
        return sumOfAllAges / persons.size();
    }

    public static void main(String[] args) {
        List<Person> list1 = new ArrayList<>();
        list1.add(new Person("Alice", 30));
        list1.add(new Person("Bob", 25));
        System.out.println(mergeAndSortPersons(null, list1));
        System.out.println(calculateAverageAge(list1));
        System.out.println(filterByMinimumAge(list1, 10));

    }
}
