package com.kodilla.patterns2.factory.tasks;

public class DrivingTask implements Task {

    String taskName;
    String where;
    String using;
    boolean done;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        this.done = false;
    }

    @Override
    public void executeTask() {
        this.done = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return done;
    }
}
