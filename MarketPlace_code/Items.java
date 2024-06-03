//Coder name: Abdullah Fouzi Naji
//Coder ID: 22012364




import java.util.ArrayList;
import java.util.List;

// This the Items class to manage a collection of Item objects
class Items {
    //The list of store Item objects
    List<Item> itemList = new ArrayList<>();

    //The method to add an item to the list
    void addItem(Item item) {
        itemList.add(item); // Adding the provided item to the itemList
    }

    //This is the method to remove an item from the list
    void removeItem(Item item) {
        itemList.remove(item); // Removing the provided item from the itemList
    }

    // Method to print all items in the list
    void printItems() {
        // Looping through each item in the itemList
        for (Item item : itemList) {
            // Printing the name and price of the current item
            System.out.println("Item: " + item.name + ", Price: " + item.price);
        }
    }
}
