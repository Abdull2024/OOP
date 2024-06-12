//Name:Moh Mohammed Faisal Hassan 
//ID:22009298

import java.util.ArrayList;
import java.util.List;

public class Sellers {
    private List<Seller> sellers;

    public Sellers() {
        this.sellers = new ArrayList<>();
    }

    public void add(Seller seller) {
        sellers.add(seller);
    }

    public void remove(String sellerId) {
        sellers.removeIf(seller -> seller.getId().equals(sellerId));
    }

    public Seller find(String sellerId) {
        for (Seller seller : sellers) {
            if (seller.getId().equals(sellerId)) {
                return seller;
            }
        }
        return null;
    }

    public void print() {
        for (Seller seller : sellers) {
            System.out.println(seller);
        }
    }
}
