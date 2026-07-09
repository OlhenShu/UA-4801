package com.softserve.academy.module11;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> setFruits = Set.of("Apple", "Banana", "Orange", "Mango", "Grapes");
        Set<String> setRandomWords = new TreeSet<>(Comparator.reverseOrder());
       // setRandomWords.add(null);
        setRandomWords.add("Pineapple");
        setRandomWords.add("Watermelon");
        setRandomWords.add("Strawberry");
        setRandomWords.add("Blueberry");
        setRandomWords.add("Raspberry");

        boolean isAdded = setRandomWords.add("Apple");
        System.out.println("isAdded = " + isAdded);// false, because "Apple" is already in the set
        System.out.println("setRandomWords = " + setRandomWords);

//        int size = setRandomWords.size();
//        System.out.println("size = " + size);// 9, because there are 9 unique elements in the set
//        boolean isRemoved = setRandomWords.remove("Mango");
//        System.out.println("isRemoved = " + isRemoved);// true, because "Mango" was in the set and has been removed
//        System.out.println("setRandomWords = " + setRandomWords);
//        boolean isContains = setRandomWords.contains("Banana");
//        System.out.println("isContains = " + isContains);// true, because "Banana" is in the set
//        boolean isContains2 = setRandomWords.contains("Mango");
//        System.out.println("isContains2 = " + isContains2);// false, because "Mango" was removed from the set
//        boolean isEmpty = setRandomWords.isEmpty();
//        System.out.println("isEmpty = " + isEmpty);// false, because the set is not empty
//        setRandomWords.clear();
//        System.out.println("setRandomWords = " + setRandomWords);// [], because the set has been cleared and is now empty
//        boolean isEmpty2 = setRandomWords.isEmpty();
//        System.out.println("isEmpty2 = " + isEmpty2);// true, because the set is now empty after being cleared
//        for (String words : setRandomWords) {
//            System.out.println("words = " + words);
//        }
    }
}
