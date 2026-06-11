package com.softserve.academy.module6.abstraction;

public class Triangle extends Shape {
    private double base;
    private double height;
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
         this.base = 1.0;
         this.height = 1.0;
         this.sideA = 1.0;
         this.sideB = 1.0;
         this.sideC = 1.0;
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle(double base, double height, double sideA, double sideB, double sideC) {
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base <= 0) {
            System.out.println("Base must be a positive number.");
            return;
        }
        this.base = base;
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
        return 0.5 * base * height;
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}
