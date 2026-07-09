package com.softserve.academy.module13;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceDemo {
    public static void main(String[] args) {
        // Create a Consumer that takes a String and prints it
        Consumer<String> printConsumer = System.out::println;
        String message = "Hello, Consumer!";
        printConsumer.accept(message);

        List<String> names = List.of("Alice", "Bob", "Charlie");

        Consumer<List<String>> printNamesConsumer = list -> {
            for (String name : list) {
                System.out.println("Good morning " + name + "!");
            }
        };
        printNamesConsumer.accept(names);
    }
}
