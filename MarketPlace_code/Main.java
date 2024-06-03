//Mohammad Adiyan Alvi
//ID: 20001611


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create Items object
        Items items = new Items();

        // Add some Item objects to Items
        Item item1 = new Item("Laptop", "High performance laptop", 999.99, "Great product", 4.5);
        Item item2 = new Item("Phone", "Latest smartphone", 799.99, "Excellent phone", 4.7);
        items.addItem(item1);
        items.addItem(item2);

        // Print all items
        System.out.println("Items:");
        items.printItems();

        // Create a Customer
        Customer customer1 = new Customer("Alvi", "123 Main St");

        // Create Orders object
        Orders orders = new Orders();

        // Add some Order objects to Orders
        Order order1 = new Order("Laptop", 999.99, "2024-06-01", "12:00 PM", customer1.name);
        Order order2 = new Order("Phone", 799.99, "2024-06-02", "01:00 PM", customer1.name);
        orders.add(order1);
        orders.add(order2);

        // Print all orders
        System.out.println("\nOrders:");
        orders.print();

        // Create Sellers object
        Sellers sellers = new Sellers();

        // Create list of items and orders for a seller
        List<String> sellerItems = new ArrayList<>();
        sellerItems.add("Laptop");
        sellerItems.add("Phone");
        List<Order> sellerOrders = new ArrayList<>();
        sellerOrders.add(order1);
        sellerOrders.add(order2);

        // Add some Seller objects to Sellers
        Seller seller1 = new Seller("Abdullah Fouzi", "001", sellerItems, sellerOrders, 4.8, "Trusted seller");
        Seller seller2 = new Seller("Mohammed Hassan", "002", new ArrayList<>(), new ArrayList<>(), 4.3, "Good seller");
        sellers.add(seller1);
        sellers.add(seller2);

        // Print all sellers
        System.out.println("\nSellers:");
        sellers.print();

        // Find and remove an order
        System.out.println("\nFinding and removing order with ID 0:");
        Order foundOrder = orders.find(0);
        if (foundOrder != null) {
            System.out.println("Found Order: " + foundOrder);
            orders.remove(0);
        }
        
        // Print all orders after removal
        System.out.println("\nOrders after removal:");
        orders.print();

        // Find and remove a seller
        System.out.println("\nFinding and removing seller with ID '001':");
        Seller foundSeller = sellers.find("001");
        if (foundSeller != null) {
            System.out.println("Found Seller: " + foundSeller);
            sellers.remove("001");
        }

        // Print all sellers after removal
        System.out.println("\nSellers after removal:");
        sellers.print();
    }
}
