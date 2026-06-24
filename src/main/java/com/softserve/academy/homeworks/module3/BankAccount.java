package com.softserve.academy.homeworks.module3;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double depositAmount) {
        if (depositAmount <= 0) {
            throw new IllegalArgumentException("Deposit amount cannot be less or equal to 0");
        }
        balance += depositAmount;
    }

    public void withdraw(double withdrawalAmount) {
        if (withdrawalAmount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount cannot be less or equal to 0");
        }
        if (withdrawalAmount < balance) {
            throw new RuntimeException("Not enough funds to withdraw");
        }
        balance -= withdrawalAmount;
    }
}
