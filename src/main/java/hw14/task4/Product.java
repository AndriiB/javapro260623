package hw14.task4;

import hw14.Type;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
    private final double price;
    private final Type type;
    private boolean isDiscount;
    private LocalDate addedDate;

    public Product(double price, Type type, boolean isDiscount, LocalDate addedDate) {
        this.price = price;
        this.type = type;
        this.isDiscount = isDiscount;
        this.addedDate = addedDate;
    }

    public double getPrice() {
        return price;
    }

    public Type getType() {
        return type;
    }

    public boolean isDiscount() {
        return isDiscount;
    }

    public LocalDate getAddedDate() {
        return addedDate;
    }

    public void setDiscount(boolean discount) {
        isDiscount = discount;
    }

    public void setAddedDate(LocalDate addedDate) {
        this.addedDate = addedDate;
    }

    public static List<Product> getLatestProducts(List<Product> products, int count) {
        return products.stream()
                .sorted(Comparator.comparing(Product::getAddedDate).reversed())
                .limit(count)
                .collect(Collectors.toList());
    }
}
