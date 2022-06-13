package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculateCost = pizzaOrder.getCost();
        //Then
        Assertions.assertEquals(new BigDecimal(15),calculateCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        String orderDescription = pizzaOrder.getDescription();
        //Then
        Assertions.assertEquals("dough and tomato sauce with cheese",orderDescription);
    }

    @Test
    public void testSalamiOnionExtraCheeseChilliPepperTasteTheHellPizzaGetCost(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new SalamiDecorator(pizzaOrder);
        pizzaOrder = new OnionDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new ChilliPepperDecorator(pizzaOrder);
        pizzaOrder = new TasteTheHellDecorator(pizzaOrder);
        //When
        BigDecimal calculateCost = pizzaOrder.getCost();
        //Then
        Assertions.assertEquals(new BigDecimal(27),calculateCost);
    }

    @Test
    public void testSalamiOnionExtraCheeseChilliPepperTasteTheHellPizzaGetDescription(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new SalamiDecorator(pizzaOrder);
        pizzaOrder = new OnionDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new ChilliPepperDecorator(pizzaOrder);
        pizzaOrder = new TasteTheHellDecorator(pizzaOrder);
        //When
        String orderDescription = pizzaOrder.getDescription();
        //Then
        Assertions.assertEquals(
                "dough and tomato sauce with cheese, salami, onion, extra cheese, chilli pepper," +
                        " sauce Taste The Hell HOT!", orderDescription);
    }


}
