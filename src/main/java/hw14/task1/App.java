package hw14.task1;

import hw14.Type;

import java.util.List;

import static hw14.task1.Product.getBooksOverPrice;

public class App {
    public static void main(String[] args) {
        List<Product> productList = List.of(
                new Product(251, Type.BOOK),
                new Product(200, Type.BOOK),
                new Product(300, Type.BOOK),
                new Product(500, Type.MAGAZINE)
        );

        List<Product> filteredBooks = getBooksOverPrice(productList);
        filteredBooks.forEach(book -> System.out.println("Category: " + book.type() + ", Price: UAH " + book.price()));
    }
    }

