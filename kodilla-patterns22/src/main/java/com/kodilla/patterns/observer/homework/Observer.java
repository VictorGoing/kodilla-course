package com.kodilla.patterns.observer.homework;

public interface Observer {
    void notifyUpdate(String studentName,int homeworksSize);
    String getName();
}
