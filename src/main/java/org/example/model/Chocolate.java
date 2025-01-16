package org.example.model;

public class Chocolate extends ProductForSale {
    private double cocoaContent; // Chocolate-specific variable

    // Existing constructor with cocoaContent parameter
    public Chocolate(String type, double price, String description, double cocoaContent) {
        super(type, price, description);
        this.cocoaContent = cocoaContent;
    }

    // New constructor with only 3 parameters to match the test
    public Chocolate(String type, double price, String description) {
        super(type, price, description);
        this.cocoaContent = 50.0; // Default cocoa content (you can change the default value as needed)
    }

    // Getter for cocoa content
    public double getCocoaContent() {
        return cocoaContent;
    }

    // Chocolate-specific method to display details
    @Override
    public void showDetails() {
        System.out.println("Type: " + getType());
        System.out.println("Price: $" + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Cocoa Content: " + cocoaContent + "%");
    }
}
