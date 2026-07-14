package com.softserve.academy.homeworks.module13.quiz;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.function.Consumer;

public class EventReminderSolution {
    public static final Consumer<LocalDate> REMINDER = targetDate -> {
        if (targetDate==null) {
            System.out.println("Date is null");
            return;
        }
        if (targetDate.isEqual(LocalDate.now()) || targetDate.isBefore(LocalDate.now())){
            System.out.println("0 days left until the event!");
            return;
        }
        System.out.println(ChronoUnit.DAYS.between(LocalDate.now(), targetDate) +
                " days till the event");
    };

    public static void remind(LocalDate date) {
        REMINDER.accept(date);
    }

    public static void main(String[] args) {
        remind(LocalDate.now().plusDays(35));
    }
}
