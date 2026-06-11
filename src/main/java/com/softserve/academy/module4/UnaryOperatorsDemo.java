package com.softserve.academy.module4;

public class UnaryOperatorsDemo {
    public static void main(String[] args) {
//        int a = 5;
//        int b = -a;
//        System.out.println("a: " + a);
//        System.out.println("b: " + b);

        int c = 10;
        int d = c++;// Post-increment: d gets the value of c (10), then c is incremented to 11
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        int e = ++c;// Pre-increment: c is incremented to 12, then e gets the value of c (12)
        System.out.println("e: " + e);
        System.out.println("c: " + c);
        e = c++ + c++ + ++c + c++ + ++c;
        System.out.println("e: " + e);

//        int d = 20;
//        d--;
//        System.out.println("d: " + d);
    }
}
