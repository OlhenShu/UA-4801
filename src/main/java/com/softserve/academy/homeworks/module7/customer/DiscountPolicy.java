package com.softserve.academy.homeworks.module7.customer;

public interface DiscountPolicy {
    double applyDiscount(double price);

    boolean isApplicable(CustomerType type);
}
