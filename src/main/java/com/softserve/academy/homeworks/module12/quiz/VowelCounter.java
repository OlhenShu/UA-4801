package com.softserve.academy.homeworks.module12.quiz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelCounter {
    public static int countVowels(String text) {
        if (text == null || text.isEmpty()){
            return 0;
        }
        Pattern p = Pattern.compile("[aoeui]");
        Matcher m = p.matcher(text.toLowerCase());
        int count = 0;
        while (m.find()){
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("This is text"));
    }
}
