package com.softserve.academy.homeworks.module13.task01;

import java.util.List;
import java.util.function.BiFunction;

public class StringMutator extends Thread {
    private static final List<Character> smallAlphabet = List.of('a', 'b', 'c', 'd', 'e',
            'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
            'x', 'y', 'z');
    private static final List<Character> bigAlphabet = List.of('A', 'B', 'C', 'D', 'E',
            'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
            'X', 'Y', 'Z');


    public static String encrypt(String s, int n) {
        if (s == null || s.isBlank() || !s.matches("[a-zA-z]+")) {
            return s;
        }
        if (n < 0) {
            return s;
        }
        return NEW_STRING.apply(s, n);
    }

    public static String decrypt(String s, int n) {
        if (s == null || s.isBlank() || !s.matches("[a-zA-z]+")) {
            return s;
        }
        if (n < 0) {
            return s;
        }
        return NEW_STRING.apply(s, n * (-1));
    }

    public static final BiFunction<Character, Integer, Character> NEW_CHAR = (c, i) -> {
        List<Character> list = (c >= 'a' && c <= 'z') ? smallAlphabet : bigAlphabet;

        int newIndex = list.indexOf(c) + i;
        if (newIndex < 0) {
            do {
                newIndex = list.size() + newIndex;
            } while (newIndex < 0);
        } else if (newIndex >= list.size()) {
            do {
                newIndex = newIndex - list.size();
            } while (newIndex >= list.size());
        }
        return list.get(newIndex);
    };

    public static final BiFunction<String, Integer, String> NEW_STRING = (s, n) -> {
        char[] chars = s.toCharArray();
        char[] result = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            result[i] = NEW_CHAR.apply(chars[i], n);
        }
        return new String(result);
    };

    public static void main(String[] args) {
        String encrypted = encrypt("aaa", 26);
        System.out.println(encrypted);
        System.out.println(decrypt(encrypted, 26));

    }
}
