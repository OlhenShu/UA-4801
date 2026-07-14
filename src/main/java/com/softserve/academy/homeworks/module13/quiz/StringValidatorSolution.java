package com.softserve.academy.homeworks.module13.quiz;

import java.util.function.Predicate;

public class StringValidatorSolution {
    public static final Predicate<String> IS_VALID = s -> {
        return s!=null && s.length() >= 5;
    };

    public static boolean validate(String s) {
        return IS_VALID.test(s);
    }
}
