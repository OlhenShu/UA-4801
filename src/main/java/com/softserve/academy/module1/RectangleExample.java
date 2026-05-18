package com.softserve.academy.module1;

import java.awt.Rectangle;

public class RectangleExample {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5, 10);
        Rectangle rect2 = new Rectangle(3, 4);
        boolean isPresent = true;

        double perimeter1 = 2 * (rect1.getWidth() + rect1.getHeight());
        System.out.println("Perimeter of rect1: " + perimeter1); // Output: Perimeter of rect1: 30.0

        double perimeter2 = 2 * (rect2.getWidth() + rect2.getHeight());
        System.out.println("Perimeter of rect2: " + perimeter2); // Output: Perimeter of rect1: 14.0
        System.out.println("Dimension:" + rect1.getSize());
        System.out.println("Location:" + rect1.getLocation());
        System.out.println("Is rect1 present? " + isPresent);
    }
}
