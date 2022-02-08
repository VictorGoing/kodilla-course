package com.kodilla.patterns.chellenge;

import java.util.List;

public class ProductOrderService {

    private InfoService info; //informacja o zamówieniu
    private BoxService box; //pakuje
    private RentalService rental; //sprawdza dostępność

    public ProductOrderService(InfoService one, BoxService two, RentalService three) {
        this.info = one;
        this.box = two;
        this.rental = three;
    }

    public void processOrder(User user){

        if(rental.checkShop(user.getBasket())){
            box.pack(user.address);
            info.SendInfo(user.getEmail());
        }
        else {
            System.out.println("nie ma");
        }
    }
}
