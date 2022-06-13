package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class TasteTheHellDecorator extends AbstractPizzaOrderDecorator{
    protected TasteTheHellDecorator(PizzaOrder pizzaOrder){super(pizzaOrder);}

    @Override
    public BigDecimal getCost(){return super.getCost().add(new BigDecimal(4));}

    @Override
    public String getDescription(){return super.getDescription() + ", sauce Taste The Hell HOT!";}
}
