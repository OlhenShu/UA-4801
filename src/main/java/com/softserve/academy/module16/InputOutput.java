package com.softserve.academy.module16;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class InputOutput {
    public static void main(String[] args) throws IOException {
        String fileName = "file.txt";
        String data = "Some data to be written and read\n";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            System.out.println("Write data to file: " + fileName);
            for (int i = (int) (Math.random() * 10); --i >= 0; ) {
                bw.write(data);
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}