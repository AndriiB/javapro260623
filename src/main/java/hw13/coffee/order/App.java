package hw13.coffee.order;

public class App {
    public static void main(String[] args) {
        CoffeeOrderBoard orders = new CoffeeOrderBoard();
        orders.add(new Order("Human"));
        orders.add(new Order("Alien"));
        orders.add(new Order("Animal"));
        orders.add(new Order("Test"));


        orders.draw();

        orders.deliver();
        orders.deliver(2);


        orders.draw();
        orders.add(new Order("Client"));

        orders.draw();
        orders.deliver(4);

        orders.draw();
    }
}
