//Coder name: Abdullah Fouzi Naji
//Coder ID: 22012364

import java.util.ArrayList;
import java.util.List;

public class Item {
    private String name;
    private String description;
    private double price;
    private List<Review> reviews;
    private List<Double> ratings;

    // Default constructor
    public Item() {
        this.name = "";
        this.description = "";
        this.price = 0.0;
        this.reviews = new ArrayList<>();
        this.ratings = new ArrayList<>();
    }

    // Parameterized constructor
    public Item(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.reviews = new ArrayList<>();
        this.ratings = new ArrayList<>();
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void addReview(Review review) {
        reviews.add(review);
    }

    public void addRating(double rating) {
        ratings.add(rating);
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public List<Double> getRatings() {
        return ratings;
    }

    public double getAverageRating() {
        if (ratings.isEmpty()) return 0.0;
        double sum = 0.0;
        for (double rating : ratings) {
            sum += rating;
        }
        return sum / ratings.size();
    }
}
