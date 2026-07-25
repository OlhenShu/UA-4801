package com.softserve.academy.homeworks.module12.quiz;

public class TextFormatter {
    public static String buildReport(String[] names) {
        if (names == null || names.length == 0) {
            return "No data available";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < names.length; i++) {
            if (i == names.length - 1) {
                sb.append(i + 1).append(". ").append(names[i]);
                break;
            }
            sb.append(i + 1).append(". ").append(names[i]).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
