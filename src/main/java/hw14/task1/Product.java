package hw14.task1;

import hw14.Type;

import java.util.List;
import java.util.stream.Collectors;

public record Product(double price, Type type) {

    public static List<Product> getBooksOverPrice(List<Product> products) {
        return products.stream()
                .filter(product -> product.type().equals(Type.BOOK) && product.price() > 250)
                .collect(Collectors.toList());
    }
}
