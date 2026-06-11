package com.softserve.academy.module6.abstraction;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            System.out.println("Side length must be a positive number.");
            return;
        }
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    public double calculateArea(double side) {
        if (side <= 0) {
            System.out.println("Side length must be a positive number.");
            return 0;
        }
        return side * side;
    }
}
