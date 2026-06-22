package com.softserve.academy.module10;

import com.softserve.academy.module3.Student;

public class Box {
    private Object obj;

    public void set(Object obj) {
        this.obj = obj;
    }

    public Object get() {
        return obj;
    }
}

class WrapperBox {
    private Box box = new Box();

    public void set(String content) {
        box.set(content);
    }

    public String get() {
        return (String) box.get();
    }
}

class GenericBox<T /*U*/> {
    private T obj;
    //private U anotherObj;

    public void set(T obj) {
        this.obj = obj;
    }

    public T get() {
        return obj;
    }
}

class App {
    public static void main(String[] args) {
        String text = "Hello, World!";
//        WrapperBox box = new WrapperBox();
//        box.set(text);
        //Integer i = (Integer) box.get();//Compile-time error: incompatible types: String cannot be converted to Integer
        GenericBox<String> genericBox = new GenericBox<>();
        genericBox.set(text);
        System.out.println(genericBox.get()); // No cast needed, returns String
        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.set(123);
        System.out.println(intBox.get()); // No cast needed, returns Integer
        GenericBox <Double> doubleGenericBox = new GenericBox();
        doubleGenericBox.set(3.14);
        System.out.println(doubleGenericBox.get());
        GenericBox rawBox = new GenericBox();    // Raw type, not recommended
        rawBox.set("Raw type example");
        System.out.println(rawBox.get());

        GenericBox <Student> studentBox = new GenericBox<>();
        studentBox.set(new Student("John",  "Doe",20, "Computer Science"));
        System.out.println(studentBox.get());
    }
}