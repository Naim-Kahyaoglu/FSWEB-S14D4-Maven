package org.example.model;

public class Coke extends ProductForSale {
    private double volume; // Coke-specific variable

    // Existing constructor with volume parameter
    public Coke(String type, double price, String description, double volume) {
        super(type, price, description);
        this.volume = volume;
    }

    // New constructor with only 3 parameters to match the test
    public Coke(String type, double price, String description) {
        super(type, price, description);
        this.volume = 1.0; // Default volume (you can change the default value as needed)
    }

    // Getter for volume
    public double getVolume() {
        return volume;
    }

    // Coke-specific method to display details
    @Override
    public void showDetails() {
        System.out.println("Type: " + getType());
        System.out.println("Price: $" + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Volume: " + volume + "L");
    }
}
