package com.softserve.academy.module12;

public class StringBuilderDemo {

    public static void main(String[] args) {

        // 1. append — додавання різних типів
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", ")
                .append("World")
                .append('!')
                .append(' ')
                .append(42);
        System.out.println("append:   " + sb); // Hello, World! 42

        // 2. insert — вставка в позицію
        sb.insert(7, "Java ");
        System.out.println("insert:   " + sb); // Hello, Java World! 42

        // 3. delete / deleteCharAt — видалення діапазону або символу
        sb.delete(7, 12);                       // видаляємо "Java "
        sb.deleteCharAt(sb.length() - 1);       // видаляємо останній символ '2'
        System.out.println("delete:   " + sb); // Hello, World! 4

        // 4. replace — заміна підрядка
        sb.replace(7, 12, "StringBuilder");
        System.out.println("replace:  " + sb); // Hello, StringBuilder! 4

        // 5. reverse — перевертання
        StringBuilder rev = new StringBuilder("abcde");
        System.out.println("reverse:  " + rev.reverse()); // edcba

        // 6. indexOf / lastIndexOf — пошук
        StringBuilder text = new StringBuilder("banana");
        System.out.println("indexOf:      " + text.indexOf("an"));     // 1
        System.out.println("lastIndexOf:  " + text.lastIndexOf("an")); // 3

        // 7. charAt / setCharAt — читання та заміна символу
        StringBuilder word = new StringBuilder("Hello");
        System.out.println("charAt(1):    " + word.charAt(1));         // e
        word.setCharAt(0, 'J');
        System.out.println("setCharAt:    " + word);                   // Jello

        // 8. substring — вирізання підрядка (без модифікації)
        StringBuilder path = new StringBuilder("/usr/local/bin");
        System.out.println("substring:    " + path.substring(5));      // local/bin
        System.out.println("substring:    " + path.substring(1, 4));   // usr

        // 9. length / capacity — розмір і ємність
        StringBuilder cap = new StringBuilder(32);
        cap.append("Java");
        System.out.println("length:       " + cap.length());           // 4
        System.out.println("capacity:     " + cap.capacity());         // 32

        // 10. chaining — ланцюгові виклики для побудови рядка
        String result = new StringBuilder()
                .append("Name: ").append("Alice")
                .append(", Age: ").append(30)
                .append(", Active: ").append(true)
                .toString();
        System.out.println("chaining:     " + result);
        // Name: Alice, Age: 30, Active: true

        // 11. Порівняння продуктивності: String / StringBuffer / StringBuilder
        final int ITERATIONS = 10_000;

        long start = System.nanoTime();
        String s = "";
        for (int i = 0; i < ITERATIONS; i++) {
            s += i;             // кожна ітерація створює новий об'єкт String
        }
        long stringTime = System.nanoTime() - start;

        start = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < ITERATIONS; i++) {
            sbuf.append(i);    // synchronized — безпечний для багатопотоковості
        }
        long sbufTime = System.nanoTime() - start;

        start = System.nanoTime();
        StringBuilder sbPerf = new StringBuilder();
        for (int i = 0; i < ITERATIONS; i++) {
            sbPerf.append(i);  // не synchronized — швидший в однопотоковому коді
        }
        long sbTime = System.nanoTime() - start;

        System.out.printf("String concat: %,d ns%n", stringTime);
        System.out.printf("StringBuffer:  %,d ns%n", sbufTime);
        System.out.printf("StringBuilder: %,d ns%n", sbTime);
        System.out.printf("SB vs String:  %.1fx faster%n", (double) stringTime / sbTime);
        System.out.printf("SB vs SBuf:    %.1fx faster%n", (double) sbufTime / sbTime);
    }
}
