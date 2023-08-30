package hw14.task6;

import hw14.Type;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import static hw14.task6.Product.groupedProducts;

public class App {
    public static void main(String[] args) {
        List<Product> productList = List.of(
                new Product(1, Type.BOOK, 100, true, LocalDate.parse("2022-08-23")),
                new Product(2, Type.BOOK, 140, true, LocalDate.parse("2022-08-30")),
                new Product(3, Type.BOOK, 300, true, LocalDate.parse("2022-08-13")),
                new Product(4, Type.MAGAZINE, 800, true, LocalDate.parse("2022-08-28")),
                new Product(5, Type.MAGAZINE, 190, true, LocalDate.parse("2022-08-29")),
                new Product(5, Type.NEWSPAPER, 110, true, LocalDate.parse("2022-08-30"))
        );

        Map<Type, List<Product>> groupedProducts = groupedProducts(productList);
        System.out.println("Grouped products by type:");
        groupedProducts.forEach((type, products) -> {
            System.out.println("Type: " + type);
            products.forEach(product -> System.out.println(" -- Product ID: " + product.getId() + ", Price: UAH " + product.getPrice() + ", Discount " + product.isDiscount() + ", Date " + product.getAddedDate()));
            });
    }
}

