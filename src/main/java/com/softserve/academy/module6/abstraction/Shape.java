package com.softserve.academy.module6.abstraction;

public abstract class Shape {
  
    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public String printClassName() {
        return " Class name: " + this.getClass().getSimpleName();
    }
}
