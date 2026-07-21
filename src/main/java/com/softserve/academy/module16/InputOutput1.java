package com.softserve.academy.module16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InputOutput1 {
    public static void main(String[] args) throws IOException {
        String fileName = "file.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String s = null;
            int count = 0;
            System.out.println("Read data from file: " + fileName);
            while ((s = br.readLine()) != null) {
                System.out.println("row " + ++count + " read:" + s);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}