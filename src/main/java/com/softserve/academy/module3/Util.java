package com.softserve.academy.module3;

public class Util {
    public static void print( String welcomeMessage, Object... messages ) {
        System.out.println(welcomeMessage);
        for (Object msg : messages) {
            System.out.println(msg);
        }
    }
}


