package com.softserve.academy.homeworks.module11.q1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueWords {
    public static Set<String> collectUnique(String[] words) {
        return new HashSet<>(Arrays.asList(words));
    }

    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "cherry"};
        System.out.println(collectUnique(words));
        Set<Object> o = new HashSet<>();
        o.add(null);
        o.add(null);
        System.out.println(o);
    }
}
