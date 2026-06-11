package com.softserve.academy.module6;

public class Parallelogram extends Rectangle {
    private double angle; // Angle in degrees

    public Parallelogram(double width, double height, double angle) {
        super(width, height);
        this.angle = angle; // Default angle for a rectangle
    }

    public Parallelogram() {
        super();
        this.angle = 90.0; // Default angle for a rectangle
    }



    @Override
    public double calculatePerimeter() {
        return 2 * (getHeight() + getWidth());
    }

//    public double calculatePerimeter(double width, double height) {
//        return 2 * (getHeight() + getWidth());
//    }
//
//    public double calculateArea() {
//        return width * height * Math.sin(Math.toRadians(angle));
//    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }
    @Override
    public double calculateArea() {
        if (getWidth() <= 0 || getHeight() <= 0 || angle <= 0 || angle >= 180) {
            System.out.println("Width and height must be positive numbers.");
            return 0;
        }
        return getWidth() * getHeight() * Math.sin(angle * Math.PI / 180);
    }

    public String printInfo() {
        return "Parallelogram: width = " + getWidth() + ", height = " + getHeight() + ", angle = " + angle;
    }

}
