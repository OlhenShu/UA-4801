package com.softserve.academy.homeworks.module7.customer;

public class VipCustomerDiscount implements DiscountPolicy {
    public VipCustomerDiscount() {
    }

    @Override
    public double applyDiscount(double price) {
        return price * 0.7;
    }

    @Override
    public boolean isApplicable(CustomerType type) {
        return type == CustomerType.VIP;
    }
}
