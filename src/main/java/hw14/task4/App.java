package hw14.task4;

import hw14.Type;
import java.time.LocalDate;
import java.util.List;

import static hw14.task4.Product.getLatestProducts;

public class App {

    public static void main(String[] args) {
    List<Product> productList = List.of(
            new Product(251, Type.BOOK, true, LocalDate.parse("2023-08-30")),
            new Product(240, Type.BOOK, true, LocalDate.parse("2023-08-25")),
            new Product(300, Type.BOOK, true, LocalDate.parse("2023-08-31")),
            new Product(250, Type.MAGAZINE, true, LocalDate.parse("2023-08-27")),
            new Product(234, Type.NEWSPAPER, true, LocalDate.parse("2023-08-29")));

    List<Product> latestThreeProducts = getLatestProducts(productList, 3);

    System.out.println("Three latest products added:");
    latestThreeProducts.forEach(product -> System.out.println("Type: " + product.getType() + ", added on: " + product.getAddedDate()));
}
}




