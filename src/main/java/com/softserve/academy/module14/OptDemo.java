package com.softserve.academy.module14;

import java.util.Optional;

public class OptDemo {
    public static void main(String[] args) {
        Integer val1 =10;
        Integer val2 = null;
        System.out.println("Sum: " + sum(Optional.ofNullable(val1), Optional.ofNullable(val2))); // Output: Sum: null
    }

    public static Integer add(Integer v1, Integer v2) {
        if (v1 != null && v2 != null) {
            return v1 + v2;
        }
        return null;
    }

    public static Integer sum(Optional<Integer> v1, Optional<Integer> v2) {
        Integer value1 = v1.get();
        Integer value2 = v2.orElse(0);
        return value1 + value2;
    }
}
