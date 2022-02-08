package com.kodilla.patterns.chellenge;

import java.util.LinkedList;
import java.util.List;

public class PatternsMain {
    public static void main(String[] args) {

        Product product = new Product("Deskolorka","Tomek Jastrzębski", 150.00,1,"Używana z Autografem wybitnego deskorolkarza");

        List<Product> listAllProducts = new LinkedList<>();
        listAllProducts.add(new Product("Książka - Harry Potter","J.K. Rowling", 12.50, 1,"Nieużywana"));
        listAllProducts.add(product);
        listAllProducts.add(new Product("Konsola GrajStacja", "Sony Ericson",5999.99, 1,"Nieużywana"));

        User user = new User("Adam","Karolczak","Zgoda 18/2 95-200 Pabianice","adamk@mail.com");
        user.addToBasket(product);

        Rental rental = new Rental(listAllProducts);
        Box box = new Box();
        Info info = new Info();

        ProductOrderService productOrderService = new ProductOrderService(info,box,rental);

        productOrderService.processOrder(user);




        /*System.out.println("Czesc");
        MovieStore object = new MovieStore();
        System.out.println(object.giveMeAll());*/
    }
}
