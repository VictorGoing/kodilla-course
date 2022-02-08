package com.kodilla.patterns.chellenge;

import java.util.LinkedList;
import java.util.List;

public class User {
    String Name;
    String Lastname;
    String address;
    String Email;
    List<Product> basket;

    public User(String name, String lastname, String address, String email) {
        this.Name = name;
        this.Lastname = lastname;
        this.address = address;
        this.Email = email;
        this.basket = new LinkedList<>();
    }

    public void addToBasket(Product product){
        this.basket.add(product);
    }

    public void deleteFromBasket(Product product){
        this.basket.remove(product);
    }

    public String getName() {
        return Name;
    }

    public String getLastname() {
        return Lastname;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return Email;
    }

    public List<Product> getBasket() {
        return basket;
    }
}
