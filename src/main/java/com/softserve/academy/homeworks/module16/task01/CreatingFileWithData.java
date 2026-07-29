package com.softserve.academy.homeworks.module16.task01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Comparator;
import java.util.List;

public class CreatingFileWithData {
    public static void main(String[] args) throws IOException {
        String newFile = "file2.txt";
        String oldFile = "file1.txt";

        Path pathToNewFile = Path.of(newFile);
        Path pathToOldFile = Path.of(oldFile);

        List<String> lines = Files.readAllLines(pathToOldFile);

        String numberOfLines = String.format("File contains %d lines.\n", lines.size());
        Files.writeString(pathToNewFile, numberOfLines, StandardOpenOption.CREATE);

        var longestLine = lines.stream().max(Comparator.comparingInt(String::length)).orElseThrow();
        Files.writeString(pathToNewFile, longestLine, StandardOpenOption.APPEND);

        String fullName = lines.stream()
                .filter(l -> l.contains("Full Name"))
                .findAny().orElseThrow();
        Files.writeString(pathToNewFile, "\n", StandardOpenOption.APPEND);
        Files.writeString(pathToNewFile, fullName, StandardOpenOption.APPEND);

        String dateOfBirth = lines.stream()
                .filter(l -> l.contains("Date of Birth"))
                .findAny().orElseThrow();
        Files.writeString(pathToNewFile, "\n", StandardOpenOption.APPEND);
        Files.writeString(pathToNewFile, dateOfBirth, StandardOpenOption.APPEND);
    }
}
