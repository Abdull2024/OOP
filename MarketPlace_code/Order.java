//Name:Moh Mohammed Faisal Hassan 
//ID:22009298

public class Order {
    private String item;
    private double price;
    private String date;
    private String time;
    private Customer customer;

    public Order(String item, double price, String date, String time, Customer customer) {
        this.item = item;
        this.price = price;
        this.date = date;
        this.time = time;
        this.customer = customer;
    }

    // Getters and setters
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order: " + item + ", price: " + price + ", date: " + date + ", time: " + time + ", customer: " + customer.getName();
    }
}
