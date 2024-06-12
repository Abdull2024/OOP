//Coder name: Abdullah Fouzi Naji
//Coder ID: 22012364

import java.util.ArrayList;
import java.util.List;

class Items {
    private List<Item> itemList = new ArrayList<>();

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void removeItem(Item item) {
        itemList.remove(item);
    }

    public void printItems() {
        for (Item item : itemList) {
            System.out.println("Item: " + item.getName() + ", Price: " + item.getPrice() + ", Average Rating: " + item.getAverageRating());
        }
    }
}
