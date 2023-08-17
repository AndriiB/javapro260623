package hw13.coffee.order;

public class Order {
    private int orderNumber;
    private String clientName;

    public Order(String name) {
        this.clientName = name;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
}
