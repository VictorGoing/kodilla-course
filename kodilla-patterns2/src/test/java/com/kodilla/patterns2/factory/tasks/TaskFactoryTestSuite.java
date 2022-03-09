package com.kodilla.patterns2.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {

    @Test
    void makeTaskDrivingTest(){
        TaskFactory taskFactory = new TaskFactory();

        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING);

        Assertions.assertEquals("Taxi",drivingTask.getTaskName());
        Assertions.assertEquals(false,drivingTask.isTaskExecuted());
        drivingTask.executeTask();
        Assertions.assertEquals(true,drivingTask.isTaskExecuted());
    }

    @Test
    void makeTaskPaintingTest(){
        TaskFactory taskFactory = new TaskFactory();

        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING);

        Assertions.assertEquals("Make",paintingTask.getTaskName());
        Assertions.assertEquals(false,paintingTask.isTaskExecuted());
        paintingTask.executeTask();
        Assertions.assertEquals(true, paintingTask.isTaskExecuted());
    }

    @Test
    void makeTaskShoppingTest(){
        TaskFactory taskFactory = new TaskFactory();

        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING);

        Assertions.assertEquals("Buy",shoppingTask.getTaskName());
        Assertions.assertEquals(false,shoppingTask.isTaskExecuted());
        shoppingTask.executeTask();
        Assertions.assertEquals(true,shoppingTask.isTaskExecuted());
    }
}
