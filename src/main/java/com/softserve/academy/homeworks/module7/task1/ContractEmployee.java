package com.softserve.academy.homeworks.module7.task1;

/**
 * Represents an employee bound by a contractual agreement, compensated
 * via a fixed, flat-rate recurring monthly amount.
 */
public class ContractEmployee extends Employee {
    private String federalTaxIdMember;
    private Double monthlyPayment;

    public ContractEmployee(String name, String employeeId, String federalTaxIdMember, Double monthlyPayment) {
        super(name, employeeId);
        this.federalTaxIdMember = federalTaxIdMember;
        this.monthlyPayment = monthlyPayment;
    }

    /**
     * Retrieves the fixed contract fee assigned to this worker.
     *
     * @return the exact flat-rate monthly payment amount
     */
    @Override
    public double calculatePay() {
        return monthlyPayment;
    }
}
