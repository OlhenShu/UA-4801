package com.softserve.academy.homeworks.module14.task01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductRunner {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(
                new Product(ManufactureCategory.PHONE, LocalDate.of(2020, 8, 1), 6700.0),
                new Product(ManufactureCategory.TV, LocalDate.of(2025, 8, 11), 5500.0),
                new Product(ManufactureCategory.PHONE, LocalDate.of(2026, 4, 15), 5345.0),
                new Product(ManufactureCategory.TABLET, LocalDate.of(2025, 8, 13), 255.0),
                new Product(ManufactureCategory.LAPTOP, LocalDate.of(2024, 2, 21), 5655.0),
                new Product(ManufactureCategory.PHONE, LocalDate.of(2023, 7, 31), 1200.0),
                new Product(ManufactureCategory.LAPTOP, LocalDate.of(2024, 8, 5), 750.0),
                new Product(ManufactureCategory.PHONE, LocalDate.of(2025, 7, 17), 5500.0),
                new Product(ManufactureCategory.TV, LocalDate.of(2025, 8, 15), 55.0),
                new Product(ManufactureCategory.PHONE, LocalDate.of(2025, 9, 15), 3000.0),
                new Product(ManufactureCategory.PHONE, LocalDate.of(2024, 9, 15), 3000.01),
                new Product(ManufactureCategory.PHONE, LocalDate.of(2025, 7, 15), 5000.0)
        ));
        List<Product> filteredProducts =
                getProductsByCriteria(products, ManufactureCategory.PHONE, LocalDate.now().minusYears(1), 3000);
        System.out.println(filteredProducts);
    }

    /**
     * Filters products by category, age, and minimum price threshold, returning them
     * sorted in ascending order of their price.
     * <p>
     * This utility selects only the products that match the specified {@link ManufactureCategory},
     * have a manufacture date strictly before the given cutoff date, and a unit price
     * strictly greater than the specified minimum price.
     * </p>
     *
     * @param products   the source {@link List} of products to evaluate
     * @param category   the target manufacture category to filter by
     * @param date the exclusive upper bound for the manufacture date (only older products are included)
     * @param minPrice   the exclusive lower bound price threshold
     * @return a new, sorted, and filtered {@link List} of products;
     * returns an empty list if no products match the criteria
     */
    private static List<Product> getProductsByCriteria(List<Product> products, ManufactureCategory category, LocalDate date, double minPrice) {
        return products.stream()
                .filter(product -> product.getCategory() == category && product.getDateOfManufacture().isBefore(date)
                        && product.getPrice() > minPrice)
                .sorted(Comparator.comparingDouble((Product::getPrice)))
                .toList();
    }
}
