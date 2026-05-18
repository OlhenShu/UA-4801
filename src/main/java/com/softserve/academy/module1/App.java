package com.softserve.academy.module1;

public class App {
    public static void main(String[] args) {
        //Primitive types
        boolean boolValue = true;// true or false
        System.out.println("Boolean value: " + boolValue);// Output: Boolean value: true

        boolean boolValue2 = boolValue;//
        char charValue = 'A';// single character
        System.out.println("Character value: " + charValue);// Output: Character value: A

        byte byteValue = 100;//-128 to 127
        System.out.println("Byte value: " + byteValue);// Output: Byte value:

        short shortValue = 10_000;//-32,768 to 32,767
        System.out.println("Short value: " + shortValue);// Output: Short value:

        int intValue = 1_000_000;//-2,147,483,648 to 2,147,483,647
        System.out.println("Integer value: " + intValue);// Output: Integer value: 1000000

        long longValue = 10_000_000_000L;//-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        System.out.println("Long value: " + longValue);// Output: Long value: 10000000000

        float floatValue = 3.14f;// single-precision floating-point
        System.out.println("Float value: " + floatValue);// Output: Float value:

        double doubleValue = 3.141592653589793;// double-precision floating-point
        System.out.println("Double value: " + doubleValue);// Output: Double value:

        int a = 10;
        int b = 20;
        System.out.println("Integer value: " + a + b);// Output: Integer value: 1020

        //Non-primitive types
        String stringValue = "Hello, World!";
        System.out.println("String value: " + stringValue);// Output: String value: Hello, World!

        Student student = new Student("John Doe", 20);
        System.out.println("Student name: " + student.name + ", age: " + student.age);// Output: Student name: John Doe, age: 20
    }
}

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}


