//Name:Moh Mohammed Faisal Hassan 
//ID:22009298

import java.util.ArrayList;
import java.util.List;

public class Orders {
    private List<Order> orders;

    public Orders() {
        this.orders = new ArrayList<>();
    }

    public void add(Order order) {
        orders.add(order);
    }

    public void remove(String itemName) {
        orders.removeIf(order -> order.getItem().equals(itemName));
    }

    public Order find(String itemName) {
        for (Order order : orders) {
            if (order.getItem().equals(itemName)) {
                return order;
            }
        }
        return null;
    }

    public void print() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
