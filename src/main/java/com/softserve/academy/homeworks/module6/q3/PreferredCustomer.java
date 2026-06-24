package com.softserve.academy.homeworks.module6.q3;

public class PreferredCustomer extends Customer {
    private double discountRate;

    public PreferredCustomer(String name, String email, int maxPurchases, double discountRate) {
        super(name, email, maxPurchases);
        if (discountRate < 0 || discountRate > 100) {
            System.out.println("Discount rate must be between 0% and 100%. Setting it to 10%");
            discountRate = 10;
        }
        this.discountRate = discountRate;
    }

    public int applyDiscount(int amount) {
        return (int) Math.round(amount - (discountRate * amount / 100.0));
    }

    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public void displayPurchaseHistory() {
        System.out.println("Customer " + name + " has following purchase history with discount:");
        for (int i = 0; i < purchaseCount; i++) {
            System.out.println(purchaseHistory[i]);
        }
    }

    @Override
    public void addPurchase(int amount) {
        if (amount < 0) {
            System.out.println("Amount of purchase is not valid");
            return;
        }
        if (purchaseHistory.length - purchaseCount < 1) {
            System.out.println("Array is full.");
            return;
        }
        int purchaseWithDiscount = applyDiscount(amount);
        purchaseHistory[purchaseCount] = purchaseWithDiscount;
        purchaseCount++;
        System.out.println("Adding purchase with discount: Original: $" + amount + ", After Discount: $" + purchaseWithDiscount);
    }
}
