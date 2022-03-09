package com.kodilla.patterns2.strategy.social;

public class ZGeneration extends User{

    public ZGeneration(String name) {
        super(name);
        this.socialPublisher = new SnapchatPublisher();
    }
}
