package com.kodilla.patterns.chellenge;

import java.util.List;

public class Rental implements RentalService{
    private final List<Product> listAllProducts;

    public Rental(List<Product> listAllProducts) {
        this.listAllProducts = listAllProducts;
    }

    public boolean checkShop(List<Product> basket){
        for(int i = 0; i < basket.size(); i++){
            if(listAllProducts.contains(basket.get(i))){}
            else return false;
        }
        return true;
    }
}
