package com.softserve.academy.module12;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StringFormatDemo {

    enum Role { ADMIN, USER, MODERATOR }
    enum Level { INFO, WARNING, ERROR }

    record LogEntry(LocalDateTime timestamp, String user, Role role, Level level, String message, long durationMs) {}

    static final String ROW_FORMAT   = "| %-19s | %-12s | %-11s | %-7s | %-30s | %8d ms |%n";
    static final String HEADER_FORMAT = "| %-19s | %-12s | %-11s | %-7s | %-30s | %-11s |%n";
    static final String SEPARATOR    = "+---------------------+--------------+-------------+---------+--------------------------------+-------------+%n";

    public static void main(String[] args) {
        // Using String.format()
        String name = "John";
        int age = 30;
        double height = 1.75;
        String formattedString1 = String.format("Name: %s, Age: %d, Height: %.2f", name, age, height);
        System.out.println(formattedString1);

        // Using printf()
        System.out.printf("Name: %s, Age: %d, Height: %.2f%n", name, age, height);

        System.out.println();

        // Log table demo
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        LogEntry[] logs = {
            new LogEntry(LocalDateTime.of(2024, 3, 15, 9, 0, 1),  "alice",   Role.ADMIN,     Level.INFO,    "User login successful",         42),
            new LogEntry(LocalDateTime.of(2024, 3, 15, 9, 1, 33), "bob",     Role.USER,      Level.WARNING, "Failed password attempt",       150),
            new LogEntry(LocalDateTime.of(2024, 3, 15, 9, 3, 7),  "carol",   Role.MODERATOR, Level.INFO,    "Post deleted by moderator",     87),
            new LogEntry(LocalDateTime.of(2024, 3, 15, 9, 5, 44), "dave",    Role.USER,      Level.ERROR,   "Database connection timeout",   3021),
            new LogEntry(LocalDateTime.of(2024, 3, 15, 9, 8, 12), "alice",   Role.ADMIN,     Level.INFO,    "Config updated: max_sessions=5", 65),
            new LogEntry(LocalDateTime.of(2024, 3, 15, 9, 9, 55), "eve",     Role.USER,      Level.ERROR,   "Unauthorized access attempt",   11),
        };

        System.out.printf(SEPARATOR);
        System.out.printf(HEADER_FORMAT, "TIMESTAMP", "USER", "ROLE", "LEVEL", "MESSAGE", "DURATION");
        System.out.printf(SEPARATOR);

        for (LogEntry e : logs) {
            System.out.printf(ROW_FORMAT,
                e.timestamp().format(fmt),
                e.user(),
                e.role(),
                e.level(),
                e.message(),
                e.durationMs());
        }

        System.out.printf(SEPARATOR);

        // Summary by role
        System.out.println("\n--- Summary by role ---");
        for (Role role : Role.values()) {
            long count = 0;
            long totalMs = 0;
            for (LogEntry e : logs) {
                if (e.role() == role) { count++; totalMs += e.durationMs(); }
            }
            System.out.printf("  %-11s  events: %2d   avg duration: %6.1f ms%n",
                role, count, count > 0 ? (double) totalMs / count : 0);
        }
    }
}
