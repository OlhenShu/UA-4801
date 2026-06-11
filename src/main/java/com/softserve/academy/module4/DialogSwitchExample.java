package com.softserve.academy.module4;

import java.util.Scanner;

public class DialogSwitchExample {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the command:");
        String command = scanner.nextLine();
        String result = switch (command.toLowerCase()) {
            case "start","run" -> "The program is starting";
            case "stop","finish" -> "The program is stopping";
            case "pause","time out" -> "The program is pausing";
            default -> "Unknown command";
        };
//        switch (command.toLowerCase()) {
//            case "start":
//                result = "The program is starting";
//                break;
//            case "stop":
//                result = "The program is stopping";
//                break;
//            case "pause":
//                result = "The program is pausing";
//                break;
//            default:
//                result = "Unknown command";
//        }

        System.out.println(result);

    }
}

