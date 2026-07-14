package com.softserve.academy.homeworks.module13.task02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateValidator {
    public static boolean validateDate(String dateString){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
        LocalDate date;
        try {
            date = LocalDate.parse(dateString, formatter);
        }catch (DateTimeParseException e){
            return false;
        }
        return dateString.equals(date.format(formatter));
    }

    public static void main(String[] args) {
        System.out.println(validateDate("07.07.89"));
        System.out.println(validateDate("221.09.00"));
        System.out.println(validateDate("13.07.26"));
        System.out.println(validateDate("11.23.26"));
        System.out.println(validateDate("02.31.12"));
    }
}
