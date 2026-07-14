package com.softserve.academy.homeworks.module13.task04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DoBPrinter {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dateOfBirth = LocalDate.of(1989, 7, 7);
        System.out.println(dateOfBirth.getDayOfWeek());
        System.out.println(dateOfBirth.plusMonths(6).getDayOfWeek());
        System.out.println(dateOfBirth.plusMonths(12).getDayOfWeek());
    }
}
