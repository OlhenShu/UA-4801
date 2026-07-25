package com.softserve.academy.homeworks.module12.quiz;

public class WordReverser {
    public static String reverseWords(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        String[] words = text.split(" ");
        String[] reversedWords = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            StringBuilder builder = new StringBuilder(words[i]);
            builder.reverse();
            reversedWords[i] = builder.toString();
        }
        for (int i = 0; i < reversedWords.length; i++) {
            text = text.replace(words[i], reversedWords[i]);
        }
        return text;
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("q    Hello World!  q   qq q"));
    }
}
