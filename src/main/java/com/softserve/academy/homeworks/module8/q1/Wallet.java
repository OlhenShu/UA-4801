package com.softserve.academy.homeworks.module8.q1;

public class Wallet {
    private int balance;

    public Wallet(int initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Negative initial balance");
        }
        balance = initialBalance;
    }

    public int deposit(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Bad deposit");
        }
        return balance += amount;
    }

    public int withdraw(int amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Bad withdraw");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds: need " + (amount - balance) + " more");
        }
        return balance-=amount;
    }

    public int getBalance() {
        return balance;
    }
}
