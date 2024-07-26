//Coder name: 1- Abdullah Fouzi Naji, Mohammed Fisal
//Coder ID: 22012364,  22009298


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.List;

public class Main extends Application {
    private Items items = new Items();
    private Sellers sellers = new Sellers(); // Updated Sellers instance
    private ListView<String> itemListView;
    private ListView<String> reviewListView;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Abdullah Naji(22012364)");

        // Dummy data for sellers (replace with your actual seller data)
        sellers.add(new Seller("Seller A", "1", 4.5, "Good service"));
        sellers.add(new Seller("Seller B", "2", 3.8, "Average service"));

        VBox root = new VBox(0); // Create the root layout
        root.setPadding(new Insets(20)); // Set padding for the root layout

        Label nameLabel = new Label("Item Name:");
        TextField nameField = new TextField();

        Label descriptionLabel = new Label("Description:");
        TextField descriptionField = new TextField();

        Label priceLabel = new Label("Price:");
        TextField priceField = new TextField();

        Button addItemButton = new Button("Add Item");
        itemListView = new ListView<>();// List view for items
        reviewListView = new ListView<>();// List view for reviews

        // Section to add reviews and ratings
        Label reviewLabel = new Label("Add Review:");
        TextField reviewField = new TextField();
        Label reviewerLabel = new Label("Reviewer:");
        TextField reviewerField = new TextField();
        Button addReviewButton = new Button("Add Review");

        Label ratingLabel = new Label("Add Rating:");
        TextField ratingField = new TextField();
        Button addRatingButton = new Button("Add Rating");

        // Adding Item
        addItemButton.setOnAction(e -> {
            try {
                String name = nameField.getText();
                String description = descriptionField.getText();
                double price = Double.parseDouble(priceField.getText());

                Item newItem = new Item(name, description, price);
                items.addItem(newItem);

                updateItemListView();
                nameField.clear();
                descriptionField.clear();
                priceField.clear();
            } catch (NumberFormatException ex) {
                showAlert(Alert.AlertType.ERROR, "Invalid price. Please enter a valid number.");
            }
        });

        // Here we add the Review
        addReviewButton.setOnAction(e -> {
            String selectedItemString = itemListView.getSelectionModel().getSelectedItem();
            if (selectedItemString != null) {
                Item selectedItem = findItemByName(selectedItemString.split("\n")[0].split(": ")[1]);
                if (selectedItem != null) {
                    String reviewText = reviewField.getText();
                    String reviewer = reviewerField.getText();
                    if (!reviewText.isEmpty() && !reviewer.isEmpty()) {
                        Review newReview = new Review(reviewText, reviewer);
                        selectedItem.addReview(newReview);
                        updateReviewListView(selectedItem);
                        reviewField.clear();
                        reviewerField.clear();
                    } else {
                        showAlert(Alert.AlertType.WARNING, "Please fill in both review and reviewer fields.");
                    }
                }
            } else {
                showAlert(Alert.AlertType.WARNING, "Please select an item to review.");
            }
        });

        // Adding Rating
        addRatingButton.setOnAction(e -> {
            String selectedItemString = itemListView.getSelectionModel().getSelectedItem();
            if (selectedItemString != null) {
                Item selectedItem = findItemByName(selectedItemString.split("\n")[0].split(": ")[1]);
                if (selectedItem != null) {
                    try {
                        double rating = Double.parseDouble(ratingField.getText());
                        if (rating >= 0 && rating <= 5) {
                            selectedItem.addRating(rating);
                            updateItemListView();
                            ratingField.clear();
                        } else {
                            showAlert(Alert.AlertType.ERROR, "Rating should be between 0 and 5.");
                        }
                    } catch (NumberFormatException ex) {
                        showAlert(Alert.AlertType.ERROR, "Invalid rating. Please enter a valid number.");
                    }
                }
            } else {
                showAlert(Alert.AlertType.WARNING, "Please select an item to rate.");
            }
        });

        // Update the review list view when an item is selected
        itemListView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                Item selectedItem = findItemByName(newValue.split("\n")[0].split(": ")[1]);
                if (selectedItem != null) {
                    updateReviewListView(selectedItem);
                }
            }
        });

        // Adding components to the layout
        root.getChildren().addAll(
                nameLabel, nameField,
                descriptionLabel, descriptionField,
                priceLabel, priceField,
                addItemButton,
                new Label("Items List:"),
                itemListView,
                new Label("Reviews:"),
                reviewListView,
                reviewLabel, reviewField,
                reviewerLabel, reviewerField,
                addReviewButton,
                ratingLabel, ratingField,
                addRatingButton
        );

        // Create and show Mohammed Fisal window
        Stage mohammedFisalStage = new Stage();
        mohammedFisalStage.setTitle("Mohammed Fisal(22009298)");

        VBox mohammedFisalRoot = new VBox(10);
        mohammedFisalRoot.setPadding(new Insets(20));

        ListView<String> sellerListView = new ListView<>();
        for (Seller seller : sellers.getSellers()) { // Here is where the issue is
            sellerListView.getItems().add(seller.getName() + " - Rating: " + seller.getRating());
        }

        mohammedFisalRoot.getChildren().addAll(
                new Label("Sellers List:"),
                sellerListView
        );

        Scene mohammedFisalScene = new Scene(mohammedFisalRoot, 300, 400);
        mohammedFisalStage.setScene(mohammedFisalScene);
        mohammedFisalStage.show();

        // Set main scene and show primary stage
        Scene scene = new Scene(root, 400, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showAlert(Alert.AlertType type, String message) {
        Alert alert = new Alert(type, message);
        alert.showAndWait();
    }

    private void updateItemListView() {
        itemListView.getItems().clear();
        for (Item item : items.getItemList()) {
            itemListView.getItems().add(item.toString());
        }
    }

    private void updateReviewListView(Item item) {
        reviewListView.getItems().clear();
        for (Review review : item.getReviews()) {
            reviewListView.getItems().add(review.toString());
        }
    }

    private Item findItemByName(String name) {
        for (Item item : items.getItemList()) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
