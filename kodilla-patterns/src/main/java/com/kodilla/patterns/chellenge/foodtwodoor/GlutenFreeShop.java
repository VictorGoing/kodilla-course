package com.kodilla.patterns.chellenge.foodtwodoor;

import java.util.HashMap;

public class GlutenFreeShop extends Producent{

    public GlutenFreeShop(String bankAccountNumber, DeliveyService delivery){
        super(bankAccountNumber, delivery);
    }

    public void process(Order order){
        sendOrderToProducent(order.getListOfProducts());
        cancelOurDeliver();
        order.setIsComplete(producentRespond());
    }

    public void sendOrderToProducent(HashMap<Product, Integer> listOfProducts){}

    public void cancelOurDeliver(){}

    public boolean producentRespond(){
        return true;
    }
}
