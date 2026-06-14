package com.softserve.academy.homeworks.module6.q3;

public class Customer {
    protected String name;
    protected String email;
    protected int[] purchaseHistory;
    protected int purchaseCount;

    public Customer(String name, String email, int maxPurchases) {
        if (maxPurchases <= 0){
            System.out.println("Max Purchases can not be equal or less than 0. We're setting it to 10");
            maxPurchases = 10;
        }
        this.name = name;
        this.email = email;
        purchaseCount = 0;
        purchaseHistory = new int[maxPurchases];
    }

    public void addPurchase(int amount) {
        if (amount < 0){
            System.out.println("Amount of purchase is not valid");
            return;
        }
        if (purchaseHistory.length - purchaseCount < 1) {
            System.out.println("Array is full.");
            return;
        }
        purchaseHistory[purchaseCount] = amount;
        purchaseCount++;
        System.out.println("Purchase is added.");
    }

    public int calculateTotalExpenditure(){
        int sum = 0;
        for (int purchase: purchaseHistory){
            sum += purchase;
        }
        return sum;
    }

    public void displayPurchaseHistory(){
        System.out.println("Customer " + name + " has following purchase history:");
        for (int i = 0; i < purchaseCount; i++) {
            System.out.println(purchaseHistory[i]);
        }
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
