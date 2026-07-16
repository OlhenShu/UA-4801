package com.softserve.academy.module14;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamProblems {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("hello", "", "world", "", "java");
//        List<String> result = new ArrayList<>();
//
//        for (String s : input) {
//            if (!s.isEmpty()) {
//                result.add(s.toUpperCase());
//            }
//        }
//
//        List<String> result1 = input.stream()
//                .filter(s -> !s.isEmpty())
//                .map(String::toUpperCase)
//                .collect(Collectors.toList());
//
//        System.out.println(result1);
//
//        Stream<String> stream = input.stream().filter(s -> !s.isEmpty());
//        long count = stream.count();
//        System.out.println("Count of non-empty strings: " + count);
//
//      //  List<String> list = stream.toList();// This line will throw an IllegalStateException because the stream has already been consumed by the count() operation
//
//        List<String> list = input.stream()
//                .filter(s -> !s.isEmpty())
//                .toList();
//
//        long newCount = list.size();
//
//        System.out.println("Count of non-empty strings: " + newCount);
//        System.out.println(list);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .findFirst()
                .ifPresent(System.out::println);
        //   Stream<Integer> randomNumbers = Stream.generate(() -> new Random().nextInt(100)).limit(10);

        Stream.iterate(1, n -> n * 2)
                .limit(10)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        LongStream s = LongStream.range(0, 1000); //0 to 999
        LongStream s1 = LongStream.rangeClosed(0, 1000); //0 to 1000

//        input.stream()
//                .filter(s2 -> {
//                    input.removeIf(String::isEmpty); //UnsupportedOperationException because Arrays.asList(...)
//                    return true;
//                }).findFirst().ifPresent(System.out::println);

        List<String> stringList = Stream.of("hello", "", "world", "", "java", "stream", "", "filter", "map").toList();

        List<Integer> filteredList = stringList.stream()
                .filter(s3 -> !s3.isEmpty())
                .map(String::length)
                .sorted(Comparator.reverseOrder())
                .distinct()
                .toList();
        System.out.println("Filtered List: " + filteredList);
        System.out.println("Count of non-empty strings: " + filteredList.size());
        System.out.println("Original List: " + stringList);
    }
}
