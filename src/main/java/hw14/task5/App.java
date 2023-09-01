package hw14.task5;

import hw14.Type;

import java.time.LocalDate;
import java.util.List;

import static hw14.task5.Product.getTotalSum;

public class App {

    public static void main(String[] args) {
    List<Product> productList = List.of(
            new Product(25, Type.BOOK, true, LocalDate.parse("2022-08-30")),
            new Product(240, Type.BOOK, true, LocalDate.parse("2023-08-25")),
            new Product(30, Type.BOOK, true, LocalDate.parse("2023-08-31")),
            new Product(25, Type.MAGAZINE, true, LocalDate.parse("2023-08-27")),
            new Product(234, Type.NEWSPAPER, true, LocalDate.parse("2023-08-29")));

        double totalSum = getTotalSum(productList);

        System.out.println("Total sum of " + Type.BOOK + " type products for the current year is: UAH " + totalSum);
}
}




