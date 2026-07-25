package com.softserve.academy.homeworks.module12.quiz;

public class PalindromeChecker {
    public static boolean isPalindrome(String text) {
        if (text == null) {
            return false;
        }
        if (text.isEmpty()){
            return true;
        }
        String textWithoutSpaces = text.replace(" ", "").toLowerCase();
        StringBuilder builder = new StringBuilder(textWithoutSpaces).reverse();
        return textWithoutSpaces.contentEquals(builder);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("abc dvcba   "));
    }
}
