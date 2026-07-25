package com.softserve.academy.homeworks.module12.task03;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class USMoneyMatcher {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void findUSMoneyInText() {
        System.out.println("Please enter text: ");
        String text = SCANNER.nextLine();
        Pattern p = Pattern.compile("\\$\\d+\\.\\d{2}\\b");
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.println(m.group());
        }
    }

    public static void main(String[] args) {
        findUSMoneyInText();
    }
}
