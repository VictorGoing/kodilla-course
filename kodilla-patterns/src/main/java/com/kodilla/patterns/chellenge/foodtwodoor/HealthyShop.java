package com.kodilla.patterns.chellenge.foodtwodoor;


public class HealthyShop extends Producent{
    private final MagazineService magazine;

    public HealthyShop(String bankAccountNumber, MagazineService magazine, DeliveyService delivery){
        super(bankAccountNumber, delivery);
        this.magazine = magazine;
    }

    public void process(Order order){
        order.setIsComplete(magazine.inMagazine(order.getListOfProducts()));
    }


}
