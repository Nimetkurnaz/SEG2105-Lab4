package com.example.lab4;

public class Product {

    private String id;
    private String productName;
    private double price;

    // Firebase requires a public empty constructor
    public Product() {
    }

    public Product(String id, String productName, double price) {
        this.id = id;
        this.productName = productName;
        this.price = price;
    }

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public void setId(String id) { this.id = id; }
    public String getId() { return id; }

    public void setProductName(String productName) { this.productName = productName; }
    public String getProductName() { return productName; }

    public void setPrice(double price) { this.price = price; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return (getProductName() + "\n" + getPrice());
    }
}