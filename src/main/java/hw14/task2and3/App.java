package hw14.task2and3;

import hw14.Type;

import java.util.List;

import static hw14.task2and3.Product.getCheapestBook;

public class App {
    public static void main(String[] args) {
        List<Product> productList = List.of(
                new Product(251, Type.BOOK, true),
                new Product(200, Type.BOOK, true),
                new Product(300, Type.BOOK, true),
                new Product(500, Type.MAGAZINE, true)
        );

        //task 2 Books with discounts
//        List<Product> booksWithDiscounts = getBooksWithDiscount(productList);
//        booksWithDiscounts.forEach(book -> System.out.println("Category: " + book.getType() + ", Price: UAH " + book.getPrice()));

        //task 3 Cheapest books
        try {
            Product cheapestBook = (Product) getCheapestBook(productList);
            System.out.println("Cheapest book at category: " + cheapestBook.getType() + ", Price: UAH " + cheapestBook.getPrice());
        } catch (ProductNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    }

