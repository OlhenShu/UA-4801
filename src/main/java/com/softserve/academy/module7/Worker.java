package com.softserve.academy.module7;

public interface Worker {
    int MIN_SALARY = 3000; // Constant for minimum salary
    int getSalary();
    String getPosition();

    static boolean isValidSalary(int salary) {
        return salary >= MIN_SALARY;
    }

    default void displayWorkerInfo() {
        System.out.println("Position: " + getPosition() + ", Salary: " + getSalary());
    }
    private void validateSalary(int salary) {
        if (!isValidSalary(salary)) {
            throw new IllegalArgumentException("Salary must be at least " + MIN_SALARY);
        }
    }

}

class Manager implements Worker {
    private int salary;

    public Manager(int salary) {
        this.salary = salary;
    }

    @Override
    public int getSalary() {
        return salary;
    }



    @Override
    public String getPosition() {
        return "Manager";
    }
}

class Developer implements Worker {
    private int salary;

    public Developer(int salary) {
        this.salary = salary;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public String getPosition() {
        return "Developer";
    }

}

class DemoWorker {
    public static void main(String[] args) {
        Worker manager = new Manager(5000);
        Worker developer = new Developer(4000);

        System.out.println("Manager Salary: " + manager.getSalary());
        System.out.println("Developer Salary: " + developer.getSalary());
        System.out.println("Is Manager's salary valid? " + Worker.isValidSalary(manager.getSalary()));
        manager.displayWorkerInfo();
        developer.displayWorkerInfo();
    }
}
