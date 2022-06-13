package com.kodilla.patterns.observer.homework;

public interface Observable {
    void addHomework(Homework homework);
    void notifyMentor(int countHomework);
    void chooseMentor(Mentor mentor);
}
