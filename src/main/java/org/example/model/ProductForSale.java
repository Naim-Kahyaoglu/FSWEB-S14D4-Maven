package org.example.model;

public abstract class ProductForSale {
    private String type;
    private double price;
    private String description;

    // Constructor
    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    // Getters
    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    // Method to calculate sales price
    public double getSalesPrice(int quantity) {
        return quantity * price;
    }

    // Abstract method to display product details
    public abstract void showDetails();
}
