package hw13.coffee.order;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CoffeeOrderBoard {
    private final List<Order> orders;
    private int nextOrderNumber;

    public CoffeeOrderBoard() {
        orders = new ArrayList<>();
        nextOrderNumber = 1;
    }

    public void add(Order order) {
        order.setOrderNumber(nextOrderNumber);
        orders.add(order);
        nextOrderNumber++;
    }

    public void deliver() {
            Order deliveredOrder = orders.remove(0);
            System.out.println("Delivering order number: " + deliveredOrder.getOrderNumber());
    }

    public void deliver(int orderNumber) {
        Order orderToBeDelivered = null;
        for (Order order : orders) {
            if (order.getOrderNumber() == orderNumber) {
                orderToBeDelivered = order;
                break;
            }
        }
        if (orderToBeDelivered != null) {
            orders.remove(orderToBeDelivered);
            System.out.println("Delivering order: " + orderToBeDelivered.getOrderNumber());

        }
    }


    public void draw() {
        System.out.println("=====================");
        System.out.println("Num |   Name");
        for (Order order : orders) {
            System.out.println(order.getOrderNumber() + "   |   " + order.getClientName());
        }
        System.out.println("=====================");
    }
}
