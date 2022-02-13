package com.kodilla.patterns.chellenge.foodtwodoor;

public class ExtraFoodShop extends Producent{

    private final StatisticService statisticService;

    public ExtraFoodShop(String bankAccountNumber, DeliveyService delivery, StatisticService statisticService) {
        super(bankAccountNumber, delivery);
        this.statisticService = statisticService;
    }

    public void process(Order order){
        statisticService.sendData(order.getListOfProducts());
        order.setIsComplete(paymentFromTheMountain(order.getPrice()));
    }

    public boolean paymentFromTheMountain(double price){
        return true;
    }



}
