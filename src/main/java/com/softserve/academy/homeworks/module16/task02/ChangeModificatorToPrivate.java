package com.softserve.academy.homeworks.module16.task02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Stream;

public class ChangeModificatorToPrivate {
    public static void main(String[] args) throws IOException {
        Path pathToOldFile = Path.of("src/main/java/com/softserve/academy/homeworks/module16/task02/ClassWithALotPublicModificators.java");
        Path pathToNewFile = Path.of("src/main/java/com/softserve/academy/homeworks/module16/task02/ClassWithALotPrivateModificators.java");

        String regex = "^(\\s*)public\\b(?!" + ".*\\bclass\\b)";

        try (Stream<String> lines = Files.lines(pathToOldFile)) {
            List<String> updatedLines = lines.map(line -> line.replaceAll(regex, "$1private"))
                    .toList();

            Files.write(pathToNewFile, updatedLines,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING);

        } catch (IOException e) {
            System.err.println("Error processing file: " + e.getMessage());
        }
    }
}
