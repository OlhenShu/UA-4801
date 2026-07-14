package com.softserve.academy.homeworks.module13.task03;

import java.time.LocalDate;
import java.util.function.Predicate;

public class LeapYearValidator {
    public static Predicate<LocalDate> IS_LEAP_YEAR = LocalDate::isLeapYear;

    public static boolean isLeapYear(int year) {
        return IS_LEAP_YEAR.test(LocalDate.of(year, 1, 1));
    }
}
