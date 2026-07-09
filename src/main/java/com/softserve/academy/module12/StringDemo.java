package com.softserve.academy.module12;

import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello").intern();
        String str4 = "Hel".concat("lo");

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));

        String str5 = "Hello World";
        String[] words = str5.split(" ");
        System.out.println(Arrays.toString(words));









     /*


        // Compare strings using equals() method
        System.out.println("str1 equals str2: " + str1.equals(str2)); // false
        System.out.println("str1 equals str3: " + str1.equals(str3)); // true

        // Compare strings using compareTo() method
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2)); // negative value
        System.out.println("str1 compareTo str3: " + str1.compareTo(str3)); // 0

        // Concatenate strings using concat() method
        String concatenated = str1.concat(" ").concat(str2);
        System.out.println("Concatenated string: " + concatenated); // Hello World

        // Get the length of a string
        System.out.println("Length of str1: " + str1.length()); // 5

        // Convert string to uppercase and lowercase
        System.out.println("Uppercase str1: " + str1.toUpperCase()); // HELLO
        System.out.println("Lowercase str2: " + str2.toLowerCase()); // world

        // Check if a string contains a substring
        System.out.println("str1 contains 'ell': " + str1.contains("ell")); // true
    */
    }

}
