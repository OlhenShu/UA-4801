package com.softserve.academy.homeworks.module4.homework;

import java.util.Scanner;

public class ErrorHandling {
    public static final Scanner SCANNER = new Scanner(System.in);

    public enum HTTPError {
        BAD_REQUEST(400), UNAUTHORIZED(401),
        FORBIDDEN(403), NOT_FOUND(404), METHOD_NOT_ALLOWED(405),
        TOO_MANY_REQUESTS(429);
        public final int code;

        HTTPError(int code) {
            this.code = code;
        }

        public int getCode() {
            return code;
        }
    }

    public static void matchTheErrorCode() {
        System.out.println("Please enter code client error code");
        int errorCode = SCANNER.nextInt();
        if (errorCode / 100 != 4) {
            System.out.println("This is not client error code.");
            return;
        }
        switch (errorCode) {
            case 400 -> System.out.println(HTTPError.BAD_REQUEST);
            case 401 -> System.out.println(HTTPError.UNAUTHORIZED);
            case 403 -> System.out.println(HTTPError.FORBIDDEN);
            case 404 -> System.out.println(HTTPError.NOT_FOUND);
            case 405 -> System.out.println(HTTPError.METHOD_NOT_ALLOWED);
            case 429 -> System.out.println(HTTPError.TOO_MANY_REQUESTS);
            default -> throw new IllegalArgumentException("Such code is not supported");
        }
    }

    public static void main(String[] args) {
        matchTheErrorCode();
        SCANNER.close();
    }


}
