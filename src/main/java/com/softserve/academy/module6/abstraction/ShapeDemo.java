package com.softserve.academy.module6.abstraction;

public class ShapeDemo {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Rectangle(7.0, 5.0),
                new Square(6.0),
                new Triangle(4.0, 3.0, 5.0),
                new Triangle(5.0, 3.0, 4.0),
                new Rectangle(6.0, 4.0),
                new Square(5.0)
        };
        for (Shape shape : shapes) {
            System.out.println(shape.printClassName());
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            System.out.println("-".repeat(10));
        }
        Square square = new Square(5.0);
        System.out.println(square.printClassName());
        Shape sh = (Shape) square;
        System.out.println(sh.printClassName());
        System.out.println(square.calculateArea(25.0));

        Shape shape = new Square(4.0);
        Square sq = (Square) shape;
        System.out.println(sq.calculateArea(16.0));
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
    }
}
