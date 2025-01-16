package org.example.model;

public class Bread extends ProductForSale {
    private int weight; // Bread-specific variable

    // Existing constructor with weight parameter
    public Bread(String type, double price, String description, int weight) {
        super(type, price, description);
        this.weight = weight;
    }

    // New constructor with only 3 parameters to match the test
    public Bread(String type, double price, String description) {
        super(type, price, description);
        this.weight = 500; // Default weight (you can change the default value as needed)
    }

    // Getter for weight
    public int getWeight() {
        return weight;
    }

    // Bread-specific method to display details
    @Override
    public void showDetails() {
        System.out.println("Type: " + getType());
        System.out.println("Price: $" + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Weight: " + weight + "g");
    }
}
