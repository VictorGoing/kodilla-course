package com.kodilla.patterns.chellenge.foodtwodoor;


import java.util.HashMap;

public interface Order {

    void setDeliveryMan(DeliveyService delivery);
    void setListOfProducts(HashMap<Product,Integer> listOfProducts);
    HashMap<Product,Integer> getListOfProducts();
    boolean setIsComplete(boolean bool);
    boolean getIsComplete();
    double getPrice();
}
