package com.softserve.academy.module10;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for managing a list of users (CRUD operations).
 */
public class UserManager {
    private List<User> users;

    public UserManager() {
        this.users = new ArrayList<>();
    }

    // Create
    public boolean addUser(User user) {
        if (user != null) {
            // Check for duplicate ID
            for (User existingUser : users) {
                if (existingUser.getId() == user.getId()) {
                    return false; // User with this ID already exists
                }
            }
            users.add(user);
            return true;
        }
        return false;
    }

    // Read (All)
    public List<User> getAllUsers() {
        return new ArrayList<>(users); // Return a copy of the list
    }

    // Read (One by ID)
    public User getUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    // Update
    public boolean updateUser(int id, String newName, String newEmail) {
        User user = getUserById(id);
        if (user != null) {
            user.setName(newName);
            user.setEmail(newEmail);
            return true;
        }
        return false;
    }

    // Delete
    public boolean deleteUser(int id) {
        User user = getUserById(id);
        if (user != null) {
            return users.remove(user);
        }
        return false;
    }

    public int size() {
        return users.size();
    }
}
