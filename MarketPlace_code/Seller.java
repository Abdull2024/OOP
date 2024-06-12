//Name:Mohammed Faisal Hassan 
//ID:22009298

import java.util.ArrayList;
import java.util.List;

public class Seller {
    private String name;
    private String id;
    private List<String> listOfItems;
    private List<Order> listOfOrders;
    private double rating;
    private String review;

    // Default constructor
    public Seller() {
        this.name = "";
        this.id = "";
        this.listOfItems = new ArrayList<>();
        this.listOfOrders = new ArrayList<>();
        this.rating = 0.0;
        this.review = "";
    }

    // Parameterized constructor
    public Seller(String name, String id, List<String> listOfItems, List<Order> listOfOrders, double rating, String review) {
        this.name = name;
        this.id = id;
        this.listOfItems = listOfItems;
        this.listOfOrders = listOfOrders;
        this.rating = rating;
        this.review = review;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getListOfItems() {
        return listOfItems;
    }

    public void setListOfItems(List<String> listOfItems) {
        this.listOfItems = listOfItems;
    }

    public List<Order> getListOfOrders() {
        return listOfOrders;
    }

    public void setListOfOrders(List<Order> listOfOrders) {
        this.listOfOrders = listOfOrders;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return "Seller name: " + name + ", id: " + id + ", \n\tlistOfItems: " + listOfItems + ", \n\tlistOfOrders: " + listOfOrders + ", \n\trating: " + rating + ", review: " + review;
    }
}
