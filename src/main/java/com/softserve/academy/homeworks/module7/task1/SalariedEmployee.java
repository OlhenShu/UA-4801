package com.softserve.academy.homeworks.module7.task1;

/**
 * Represents a non-exempt employee compensated dynamically based on
 * an hourly work schedule tracking system.
 */
public class SalariedEmployee extends Employee {
    private String socialSecurityNumber;
    private Double hourlyRate;
    private int numberOfWorkingHours;

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public Double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(Double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getNumberOfWorkingHours() {
        return numberOfWorkingHours;
    }

    public void setNumberOfWorkingHours(int numberOfWorkingHours) {
        this.numberOfWorkingHours = numberOfWorkingHours;
    }

    public SalariedEmployee(String name, String employeeId, String socialSecurityNumber, Double hourlyRate, int numberOfWorkingHours) {
        super(name, employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.numberOfWorkingHours = numberOfWorkingHours;
    }

    /**
     * Dynamically calculates total earnings by multiplying logged hours
     * against the worker's base hourly wage profile.
     *
     * @return the cumulative total pay earned for hours worked
     */
    @Override
    public double calculatePay() {
        return hourlyRate * numberOfWorkingHours;
    }
}
