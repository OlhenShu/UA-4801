package com.softserve.academy.module14;

import java.util.Optional;

public class OptinalDemo {

    public static void main(String[] args) {
        Optional<String> filled = Optional.of("Hello, World!");
        Optional<String> nullable = Optional.ofNullable(null);
        Optional<String> empty = Optional.empty();

        Integer value = null;
        Optional<Integer> opt = Optional.ofNullable(value);
//        opt.get(); // This will throw NoSuchElementException because the Optional is empty
//        opt.orElse(0); // This will return 0 because the Optional is empty
//        opt.orElseThrow();// This will throw NoSuchElementException because the Optional is empty
//        opt.isPresent(); // This will return false because the Optional is empty
        opt.ifPresent(v -> System.out.println("Value is present: " + v)); // This will not print anything because the Optional is empty
    }
}
