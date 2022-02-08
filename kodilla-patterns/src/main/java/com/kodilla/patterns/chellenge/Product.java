package com.kodilla.patterns.chellenge;

public class Product {
    String name;
    String seller;
    double price;
    int quantity;
    String description;

    public Product(String name, String seller, double price, int quantity, String description) {
        this.name = name;
        this.seller = seller;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }
}
