package hw3;

public class BurgerMain {
    public static void main(String[] args) {
        Burger regularBurger = new Burger("white", "beef", "cheddar", "blt", "mayo");
        Burger dietBurger = new Burger("rye", "chicken", "cottage", "lettuce", "no mayo");
        Burger doubleMeat = new Burger("brioche", "beef", "cheddar", "tomato", "mayo", true);
    }
}
