package com.softserve.academy.homeworks.module13.quiz;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;

public class DateFormatterFn {
    public static DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    public static Function<LocalDate, String> FORMATTER_FN = d -> {
        if (d == null){
            return "not valid date";
        }
        return d.format(FORMATTER);
    };

    public static String format(LocalDate date) {
        return FORMATTER_FN.apply(date);
    }

    public static void main(String[] args) {
        System.out.println(format(LocalDate.of(2025, 3, 12)));
    }
}
