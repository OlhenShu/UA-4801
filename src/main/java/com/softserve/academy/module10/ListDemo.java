package com.softserve.academy.module10;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("Hello");
        stringList.add("World");
        stringList.add("!");
        stringList.add("This");
        stringList.add("is");
        stringList.add("a");
        stringList.add("generic");
        stringList.add("list");
        System.out.println("String List: " + stringList);
        System.out.println("String List size: " + stringList.size());
        System.out.println("String List contains 'World': " + stringList.contains("World"));
        System.out.println("String List index of 'generic': " + stringList.indexOf("generic"));
        stringList.remove("!");
        System.out.println("String List after removing '!': " + stringList);
        System.out.println("String List is empty: " + stringList.isEmpty());
        stringList.set(0, "Hi");
        stringList.addFirst("there");
        System.out.println(stringList.getFirst());
        System.out.println("String List after setting index 0 to 'Hi': " + stringList);
        stringList.clear();
        System.out.println("String List after clearing: " + stringList);
//
//            List<Integer> intList = new List<>();
//            intList.add(1);
//            intList.add(2);
//            intList.add(3);
//            System.out.println("Integer List: " + intList);
//
//            List<Double> doubleList = new List<>();
//            doubleList.add(3.14);
//            doubleList.add(2.718);
//            System.out.println("Double List: " + doubleList);

        // Using raw type (not recommended)

    }
}

