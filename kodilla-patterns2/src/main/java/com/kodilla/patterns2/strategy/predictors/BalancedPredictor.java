package com.kodilla.patterns2.strategy.predictors;

import com.kodilla.patterns2.strategy.BuyPredictor;

public class BalancedPredictor implements BuyPredictor {

    @Override
    public String predictWhatToBuy() {
        return "[Balanced predictor] Buy shared units of Fund XYZ";
    }
}