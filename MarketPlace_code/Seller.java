//Name:Moh Mohammed Faisal Hassan 
//ID:22009298

import java.util.List;

public class Seller {
    private String name;
    private String id;
    private List<String> listOfItems;
    private List<Order> listOfOrders;
    private double rating;
    private String review;

    public Seller(String name, String id, List<String> listOfItems, List<Order> listOfOrders, double rating, String review) {
        this.name = name;
        this.id = id;
        this.listOfItems = listOfItems;
        this.listOfOrders = listOfOrders;
        this.rating = rating;
        this.review = review;
    }

    public String getId() {
        return id;
    }

    
    public String toString() {
        return "Seller name: " + name + ", id: " + id + ", \n\tlistOfItems: " + listOfItems + ", \n\tlistOfOrders: " + listOfOrders + ", \n\trating: " + rating + ", review: " + review ;
    }
}