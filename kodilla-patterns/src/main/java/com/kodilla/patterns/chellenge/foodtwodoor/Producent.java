package com.kodilla.patterns.chellenge.foodtwodoor;

import java.util.HashMap;

public abstract class Producent {

    private final String bankAccountNumber;
    private final DeliveyService delivery;
    public Producent(String bankAccountNumber, DeliveyService delivery){
        this.bankAccountNumber = bankAccountNumber;
        this.delivery = delivery;
    }

    public void newOrder(Order order,HashMap<Product, Integer> listOfProducts){
        order.setDeliveryMan(delivery);
        order.setListOfProducts(listOfProducts);
    }

    public boolean realized(Order order){
        delivery.waitForDelivery();
        return order.getIsComplete();
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }
}
