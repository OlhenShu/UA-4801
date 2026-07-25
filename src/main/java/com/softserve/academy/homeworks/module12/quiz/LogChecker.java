package com.softserve.academy.homeworks.module12.quiz;

public class LogChecker {
    public static boolean containsKeyword(String logLine, String keyword) {
        if (keyword.isEmpty()){
            return false;
        }
        String logLineToLowerCase = logLine.toLowerCase();
        String match = keyword.toLowerCase();
        return logLineToLowerCase.matches(".*\\b" + match + "\\b.*");
    }

    public static void main(String[] args) {
        System.out.println(containsKeyword("123Error", ""));
    }
}
