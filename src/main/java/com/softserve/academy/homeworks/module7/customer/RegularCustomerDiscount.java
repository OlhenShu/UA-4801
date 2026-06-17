package com.softserve.academy.homeworks.module7.customer;

public class RegularCustomerDiscount implements DiscountPolicy {
    public RegularCustomerDiscount() {
    }

    @Override
    public double applyDiscount(double price) {
        return price * 0.9;
    }

    @Override
    public boolean isApplicable(CustomerType type) {
        return type.equals(CustomerType.REGULAR);
    }
}
