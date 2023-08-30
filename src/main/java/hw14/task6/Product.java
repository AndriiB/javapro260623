package hw14.task6;

import hw14.Type;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Product {
    private final int id;
    private final Type type;
    private final double price;
    private boolean isDiscount;
    private LocalDate addedDate;

    public Product(int id, Type type, double price, boolean isDiscount, LocalDate addedDate) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.isDiscount = isDiscount;
        this.addedDate = addedDate;
    }

    public int getId() {
        return id;
    }

    public Type getType() {
        return type;
    }

    public double getPrice() {
        return price;
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

    public static Map<Type, List<Product>> groupedProducts(List<Product> products) {
        return  products.stream()
                .collect(Collectors.groupingBy(Product::getType));
    }
}
