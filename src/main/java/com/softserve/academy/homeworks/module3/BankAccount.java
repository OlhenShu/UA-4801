package com.softserve.academy.homeworks.module3;

public class BankAccount {
    private String accountNumber;
    private double balance;
    public int i=1;

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
        balance = balance + depositAmount;
    }

    public void withdraw(double withdrawalAmount) {
        if (balance >= withdrawalAmount){
            balance = balance - withdrawalAmount;
        }
    }

    private static double newMethod(){
        return 65.6;
    }
}
