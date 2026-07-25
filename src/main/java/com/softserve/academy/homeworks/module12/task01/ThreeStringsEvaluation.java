package com.softserve.academy.homeworks.module12.task01;

import java.util.*;

public class ThreeStringsEvaluation {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static String[] stringsFromUser;

    public static void getStringsFromUser() {
        System.out.println("Please enter sentence of 5 words:");
        String sentence = SCANNER.nextLine();
        if (!sentence.matches("^\\s*([a-zA-Z]+(\\s+|$)){5}$")) {
            throw new IllegalArgumentException("String doesn't match requirements - 5 words.");
        }
        stringsFromUser = sentence.split(" ");
    }

    public static String longestWord() {
        String longestWord = stringsFromUser[0];
        for (String word : stringsFromUser) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static int numberOfUniqueLettersInLongestWord(String word) {
        char[] charactersFromWord = word.toLowerCase().toCharArray();
        Set<Character> uniqueCharacters = new HashSet<>();
        for (char c : charactersFromWord) {
            uniqueCharacters.add(c);
        }
        return uniqueCharacters.size();
    }

    public static String secondWordInReverse() {
        StringBuilder stringBuilder = new StringBuilder(stringsFromUser[1]);
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        getStringsFromUser();
        System.out.println(Arrays.toString(stringsFromUser));
        String longestWord = longestWord();
        System.out.println("Longest word is: " + longestWord);
        System.out.println("Number of unique letters in longest word: " + numberOfUniqueLettersInLongestWord(longestWord));
        System.out.println("Second word in reverse: " + secondWordInReverse());
    }
}
