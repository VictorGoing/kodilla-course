package com.kodilla.patterns2.strategy;

import com.kodilla.patterns2.strategy.predictors.ConservativePredictor;

public class IndividualCustomer extends Customer {

    public IndividualCustomer(String name) {
        super(name);
        this.buyPredictor = new ConservativePredictor();
    }
}