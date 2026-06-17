package com.softserve.academy.homeworks.module7.task1;

/**
 * Defines the core contract for any financial entity or entity type
 * that can calculate an associated payout or wage.
 */
public interface Payment {
    /**
     * Calculates the total payment amount.
     *
     * @return the calculated payout value as a double
     */
    double calculatePay();
}
