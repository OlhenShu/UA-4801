package com.softserve.academy.module4;

import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String role = sc.nextLine().toUpperCase();
        String permissions = switch (role) {
            case "ADMIN" -> {
                System.out.println("Assigning full access");
                yield "ALL_PERMISSIONS";
            }
            case "USER" -> {
                System.out.println("Assigning limited access");
                yield "READ_ONLY";
            }
            default -> "NO_ACCESS";
        };
        System.out.println("Permissions: " + permissions);
    }
}
