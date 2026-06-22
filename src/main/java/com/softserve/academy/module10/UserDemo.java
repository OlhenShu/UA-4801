package com.softserve.academy.module10;

import java.util.List;

public class UserDemo {
    public static void main(String[] args) {
        UserManager manager = new UserManager();

        // 1. Creating users (Create)
        System.out.println("--- Adding users ---");
        manager.addUser(new User(1, "Alex", "alex@example.com"));
        manager.addUser(new User(2, "Maria", "maria@example.com"));
        manager.addUser(new User(3, "John", "john@example.com"));
        System.out.println("Added " + manager.size() + " users.");

        // 2. Getting all users (Read All)
        System.out.println("\n--- List of all users ---");
        printUsers(manager.getAllUsers());


        // 3. Search by ID (Read One)
        System.out.println("\n--- Searching for user with ID 3 ---");
        User user3 = manager.getUserById(3);
        System.out.println(user3 != null ? user3 : "User not found");

        // 4. Updating data (Update)
        System.out.println("\n--- Updating user with ID 2 ---");
        boolean updated = manager.updateUser(2, "Maria Ivanova", "m.ivanova@example.com");
        if (updated) {
            System.out.println("Data updated: " + manager.getUserById(2));
        }

        // 5. Deletion (Delete)
        System.out.println("\n--- Deleting user with ID 1 ---");
        boolean deleted = manager.deleteUser(1);
        if (deleted) {
            System.out.println("User with ID 1 deleted.");
        }

        // 6. Checking the list after deletion
        System.out.println("\n--- List of users after changes ---");
        printUsers(manager.getAllUsers());
    }

    //
    private static void printUsers(List<User> users) {
        if (users.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            for (User user : users) {
                System.out.println(user);
            }
        }
    }
}
