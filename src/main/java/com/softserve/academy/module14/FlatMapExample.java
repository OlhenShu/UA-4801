package com.softserve.academy.module14;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FlatMapExample {
    public static void main(String[] args) {

        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        // Using flatMap to convert a 2D array into a 1D stream
        String[] result = Stream.of(data)
                .flatMap(Stream::of)
                .toArray(String[]::new);

        // Printing the result
        System.out.println(Arrays.toString(result)); // Output: [a, b, c, d, e, f]
        List<String> sentences = Arrays.asList("Hello Java", "Java Streams", "FlatMap Example");
        List<String> words = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))//map-> Stream<Stream<String>>
                .distinct()
                .sorted()
                .toList();
        System.out.println(words); // Output: [Hello, World, Java, Streams, FlatMap, Example]

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        int sum = numbers.parallelStream()
                .reduce(5, Integer::sum);

        System.out.println("Sum: " + sum); // Output: Sum: 25

        Optional<Integer> res = numbers.stream()
                .reduce(Integer::sum);
    }
}
