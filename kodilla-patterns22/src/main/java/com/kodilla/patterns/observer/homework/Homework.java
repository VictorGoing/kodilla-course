package com.kodilla.patterns.observer.homework;

public class Homework {

    private static final String toImprove = "to improve";
    private static final String UNCHECKED = "unchecked";
    private String name;
    private String status;


    public Homework(String name) {
        this.name = name;
        this.status = UNCHECKED;
    }

    public void changeStatus(){
        this.status = toImprove;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }
}
