package com.softserve.academy.homeworks.module14.quiz;

import java.util.Comparator;
import java.util.List;

public class LongestWordFinder {
    public static String find(List<String> words) {
        if(words == null || words.isEmpty()){
            return null;
        }
        return words.stream().sorted(Comparator.comparing(String::length).reversed()).findAny().orElseThrow();
    }
}
