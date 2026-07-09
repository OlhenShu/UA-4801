package com.softserve.academy.module13;

public class MyGreengService {
    public static void main(String[] args) {
        GreetingService greetingService = msg -> "Hello, " + msg + "!";
        GreetingService userName = (String u) -> "Good morning, " + u + "!";

        String result = greetingService.greet("World");
        System.out.println(greetingService.sumTwoNumbers(5, 10));
        String result2 = userName.greet("Anna");
        System.out.println(result);
        System.out.println(result2);
    }

}
