package com.softserve.academy.homeworks.module14.task01;

import java.time.LocalDate;

public class Product {
    private ManufactureCategory category;
    private LocalDate dateOfManufacture;
    private double price;

    public Product(ManufactureCategory category, LocalDate dateOfManufacture, double price) {
        if (category == null || dateOfManufacture == null) {
            throw new IllegalArgumentException("Product can't be null or empty");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Product price can't be negative");
        }
        if (dateOfManufacture.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Product date can't be in the future");
        }
        this.category = category;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public ManufactureCategory getCategory() {
        return category;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    @Override
    public String toString() {
        return "Product{" +
                "category=" + category +
                ", dateOfManufacture=" + dateOfManufacture +
                ", price=" + price +
                '}';
    }

    public double getPrice() {
        return price;
    }
}
