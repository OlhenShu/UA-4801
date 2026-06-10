package com.softserve.academy.homeworks.module6.q2;

public class ApplianceRunner {
    public static void main(String[] args) {
        Refrigerator refrigerator = new Refrigerator("Sumsung", "Family Hub", 600);
        WashingMachine washingMachine = new WashingMachine("LG", "TWINWash", 15);
        refrigerator.displayInfo();
        washingMachine.displayInfo();
    }
}
