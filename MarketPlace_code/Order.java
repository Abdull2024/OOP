//Name:Moh Mohammed Faisal Hassan 
//ID:22009298

public class Order {
    private String item;
    private double price;
    private String date;
    private String time;
    private String customer;

    public Order(String item, double price, String date, String time, String customer) {
        this.item = item;
        this.price = price;
        this.date = date;
        this.time = time;
        this.customer = customer;
    }

    
    public String toString() {
        return "Order: "  + item + ", price: " + price + ", date: " + date + ", time: " + time + ", customer: " + customer ;
    }
}