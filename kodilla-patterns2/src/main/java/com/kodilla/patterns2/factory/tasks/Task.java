package com.kodilla.patterns2.factory.tasks;

public interface Task {
    void executeTask();
    String getTaskName();
    boolean isTaskExecuted();
}
