package com.softserve.academy.homeworks.module12.task02;

import java.util.Scanner;

public class SpaceRemover {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void removeExtraSpaces() {
        System.out.println("Please enter sentence you want to update:");
        String sentence = SCANNER.nextLine();
        String newSentence = sentence.replaceAll(" +", " ");
        System.out.println(newSentence);
    }

    public static void main(String[] args) {
        removeExtraSpaces();
    }
}
