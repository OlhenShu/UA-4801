package com.softserve.academy.homeworks.module8.q2;

public class TransactionValidator {
    public static void validateAmount(double amount) {
        if (amount <= 0) {
            throw new InvalidTransactionException("Amount must be positive");
        }
    }

    public static void validateCurrency(Currency currency) {
        if (currency == null) {
            throw new InvalidTransactionException("Unsupported currency");
        }
    }

    public static void validateDescription(String description) {
        if (description == null) {
            throw new InvalidTransactionException("Description cannot be empty");
        }
    }

    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException("message");
        }catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }finally {
            System.out.println("the end");
        }
    }
}
