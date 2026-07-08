package com.softserve.academy.homeworks.module11.task01;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetRunner {
    public static void main(String[] args) {
        Set<String> words1 = new HashSet<>(List.of("apple", "banana", "can", "cat", "bird"));
        Set<String> words2 = new HashSet<>(List.of("tea", "banana", "chicken", "cat", "octopus"));
        System.out.println(SetManager.intersect(words1, words2));
        System.out.println(SetManager.union(words1, words2));


    }
}
