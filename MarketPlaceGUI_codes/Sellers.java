import java.util.ArrayList;
import java.util.List;

public class Sellers {
    private List<Seller> sellers;

    // Default constructor
    public Sellers() {
        this.sellers = new ArrayList<>();
    }

    // Method to add a seller
    public void add(Seller seller) {
        sellers.add(seller);
    }

    // Method to remove a seller by ID
    public void remove(String sellerId) {
        sellers.removeIf(seller -> seller.getId().equals(sellerId));
    }

    // Method to find a seller by ID
    public Seller find(String sellerId) {
        for (Seller seller : sellers) {
            if (seller.getId().equals(sellerId)) {
                return seller;
            }
        }
        return null;
    }

    // Method to get all sellers
    public List<Seller> getSellers() {
        return sellers;
    }
}
