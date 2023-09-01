package hw14.task2and3;
import hw14.Type;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
    private final double price;
    private final Type type;
    private boolean isDiscount;

    public Product(double price, Type type, boolean isDiscount) {
        this.price = price;
        this.type = type;
        this.isDiscount = isDiscount;
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

    public void setDiscount(boolean discount) {
        isDiscount = discount;
    }

    public static List<Product> getBooksWithDiscount(List<Product> products) {
        return products.stream()
                .filter(product -> product.getType().equals(Type.BOOK) && product.isDiscount())
                .map(product -> {
                    double discountedPrice = product.getPrice() * 0.9;
                    return new Product(discountedPrice, product.getType(), true);
                })
                .collect(Collectors.toList());
    }

    //tASK 3.2
    public static Product getCheapestBook(List<Product> products) throws ProductNotFoundException {
        return products.stream()
                .filter(product -> product.getType().equals(Type.NEWSPAPER))
                .min((product1, product2) -> Double.compare(product1.getPrice(), product2.getPrice()))
                .orElseThrow(() -> new ProductNotFoundException("Product [category: " +  Type.BOOK + "] not found"));
    }

}
