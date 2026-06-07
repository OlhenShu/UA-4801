package com.softserve.academy.homeworks.module5.homework.carsTask;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class CarsRunner {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        // 1. Initialize mock inventory data
        Car[] cars = {
                new Car(CarTypes.VAN, 1989, 4.5),
                new Car(CarTypes.CROSSOVER, 2023, 2.0),
                new Car(CarTypes.MICRO, 2017, 1.0),
                new Car(CarTypes.SEDAN, 2020, 3.0)
        };

        // 2. Prompt user for a valid manufacturing year
        System.out.println("Please enter the year of car production that you're looking for:");
        int yearToFind = 0;
        do {
            yearToFind = SCANNER.nextInt();
            if (yearToFind < 0 || yearToFind > LocalDate.now().getYear()) {
                System.out.println("The year you've entered is not valid.");
                System.out.println("Please try again.");
            }
        } while (yearToFind <= 0 || yearToFind > LocalDate.now().getYear());

        // 3. Search inventory for matching vehicles
        boolean carIsFound = false;
        for (Car car : cars) {
            if (car.getYearOfProduction() == yearToFind) {
                System.out.println(car + " was found.");
                carIsFound = true;
            }
        }
        if (!carIsFound) {
            System.out.println("There are no cars with such year of production.");
        }

        // 4. Demonstrate the in-place sorting algorithm
        System.out.println(Arrays.toString(cars));
        sortCarsByYearOfProduction(cars);
        System.out.println(Arrays.toString(cars));
    }

    /**
     * Sorts an array of Car objects in ascending order based on their production year.
     * <p>
     * This method implements the Bubble Sort algorithm, modifying the original array
     * in-place by repeatedly swapping adjacent elements that are out of order.
     * </p>
     *
     * @param cars the array of Car objects to be sorted
     */
    private static void sortCarsByYearOfProduction(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars.length - 1; j++) {
                if (cars[j].getYearOfProduction() > cars[j + 1].getYearOfProduction()) {
                    Car buffer = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = buffer;
                }
            }
        }
    }
}
