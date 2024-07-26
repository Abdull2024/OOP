//Coder name: Abdullah Fouzi Naji
//Coder ID: 22012364

import java.util.ArrayList;
import java.util.List;

public class Item {
    private String name;
    private String description;
    private double price;
    private List<Review> reviews = new ArrayList<>();
    private List<Double> ratings = new ArrayList<>();

    public Item(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
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
        if (ratings.isEmpty()) return 0;
        double sum = 0;
        for (double rating : ratings) {
            sum += rating;
        }
        return sum / ratings.size();
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nDescription: " + description + "\nPrice: $" + price + "\nAverage Rating: " + getAverageRating();
    }
}
