package com.kodilla.patterns.observer.homework;

import java.util.List;

public class Mentor implements Observer{
    private String name;
    private int notifyCount;

    public Mentor(String name) {
        this.name = name;
        this.notifyCount = 0;
    }

    @Override
    public void notifyUpdate(String studentName,int homeworksSize) {
        System.out.println(studentName + " have " + homeworksSize + " works to check.");
        notifyCount++;
    }


    public String getName() {
        return name;
    }

    public int getNotifyCount() {
        return notifyCount;
    }
}
