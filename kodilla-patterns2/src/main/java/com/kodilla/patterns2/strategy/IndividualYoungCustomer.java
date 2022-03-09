package com.kodilla.patterns2.strategy;

import com.kodilla.patterns2.strategy.predictors.AggressivePredictor;

public class IndividualYoungCustomer extends Customer {

    public IndividualYoungCustomer(String name) {
        super(name);
        this.buyPredictor = new AggressivePredictor();
    }
}
