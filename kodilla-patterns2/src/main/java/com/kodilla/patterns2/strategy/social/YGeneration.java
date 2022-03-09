package com.kodilla.patterns2.strategy.social;

public class YGeneration extends User{

    public YGeneration(String name) {
        super(name);
        this.socialPublisher = new TwitterPublisher();
    }
}
