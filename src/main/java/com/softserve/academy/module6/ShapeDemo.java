package com.softserve.academy.module6;

public class ShapeDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(7.0, 5.0);
//        rectangle.setHeight(7.0);
//        rectangle.setWidth(5.0);
        System.out.println("Rectangle: " + rectangle.getWidth());
        System.out.println("Rectangle height: " + rectangle.getHeight());
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());
        Parallelogram parallelogram = new Parallelogram(8.0, 4.0, 45.0);
//        parallelogram.setWidth(8.0);
//        parallelogram.setHeight(4.0);
//        parallelogram.setAngle(45.0);
        System.out.println("Parallelogram width: " + parallelogram.getWidth());
        System.out.println("Parallelogram height: " + parallelogram.getHeight());
        System.out.println("Parallelogram angle: " + parallelogram.getAngle());
        System.out.println("Parallelogram perimeter: " + parallelogram.calculatePerimeter());

        int i = 100;
        long l = i;
        System.out.println("Integer value: " + i);
        System.out.println("Long value: " + l);

        byte b = (byte) l;
        System.out.println("Byte value: " + b);

    }
}
