package com.softserve.academy.homeworks.module7.task1;

/**
 * Represents a generic workforce member, establishing the foundational
 * state and sorting rules for all specific employee types.
 * <p>
 * This class implements {@link Comparable} to enforce a default sorting order
 * based on total pay, arranging employees from highest paid to lowest paid
 * (descending order).
 * </p>
 */
public abstract class Employee implements Payment, Comparable<Employee> {
    private String name;
    private String employeeId;

    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * Compares this employee against another Employee object based on earnings.
     * <p>
     * Note: The comparison parameters are inverted internally to naturally
     * achieve a descending sort order (highest earnings bubble to the top).
     * </p>
     *
     * @param employee the other Employee entity to compare against
     * @return a negative integer, zero, or a positive integer as this employee's
     * pay is greater than, equal to, or less than the specified payment
     */
    @Override
    public int compareTo(Employee employee) {
        return Double.compare(employee.calculatePay(), this.calculatePay());
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * Compiles a string representation containing key profile details
     * and calculated financial data.
     *
     * @return a formatted text summary of the employee's attributes
     */
    public String getInfo() {
        return "Employee with id '" + employeeId +
                "' and name " + name +
                " has average monthly wage " + calculatePay();
    }
}
