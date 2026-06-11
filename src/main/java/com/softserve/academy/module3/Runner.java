package com.softserve.academy.module3;

import static com.softserve.academy.module3.Util.print;

class Runner {
    public static void main(String[] args) {
        Student student = new Student();
        print("Hello", student,"Hi", "Welcome", 10, 20.5, false, 'c');
    }
}