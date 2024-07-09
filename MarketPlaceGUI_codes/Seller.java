//Name:Moh Mohammed Faisal Hassan 
//ID:22009298

public class Seller {
    private String name;
    private String id;
    private double rating;
    private String review;

    // Default constructor
    public Seller() {
        this.name = "";
        this.id = "";
        this.rating = 0.0;
        this.review = "";
    }

    // Parameterized constructor
    public Seller(String name, String id, double rating, String review) {
        this.name = name;
        this.id = id;
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
}
