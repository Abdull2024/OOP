//Coder name: Abdullah Fouzi Naji
//Coder ID: 22012364


import java.util.ArrayList;
import java.util.List;

//The Item class to represent an individual item with various attributes
class Item {
    String name; // the item's name
    String description; //  the item's description
    double price; //  the item's price
    String review; //  the item's review
    double rating; //  the item's rating

    // Constructor to initialize an Item object with given attributes
    Item(String name, String description, double price, String review, double rating) {
        this.name = name; 
        this.description = description; 
        this.price = price; 
        this.review = review; 
        this.rating = rating; 
    }
}
