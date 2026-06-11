package com.softserve.academy.module6.abstraction;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            System.out.println("Width must be a positive number.");
            return;
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            System.out.println("Height must be a positive number.");
            return;
        }
        this.height = height;
    }

    @Override
    public double calculateArea() {
        if (width <= 0 || height <= 0) {
            System.out.println("Width and height must be positive numbers.");
            return 0;
        }
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        if (width <= 0 || height <= 0) {
            System.out.println("Width and height must be positive numbers.");
            return 0;
        }
        return 2 * (width + height);
    }
}
