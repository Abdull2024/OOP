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

    public void remove(int orderId) {
        if (orderId >= 0 && orderId < orders.size()) {
            orders.remove(orderId);
        }
    }

    public void print() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }

    public Order find(int orderId) {
        if (orderId >= 0 && orderId < orders.size()) {
            return orders.get(orderId);
        }
        return null;
    }
}