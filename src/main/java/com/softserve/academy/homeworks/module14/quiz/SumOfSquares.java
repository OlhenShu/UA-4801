package com.softserve.academy.homeworks.module14.quiz;

import java.util.List;

public class SumOfSquares {
    public static int calculate(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()){
            return 0;
        }
        return numbers.stream().map(n -> n * n).reduce(0, Integer::sum);
    }
}
