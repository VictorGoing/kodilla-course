package com.kodilla.patterns2.factory.tasks;

public class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskClass){
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("Taxi", "centrum", "car");
            case PAINTING:
                return new PaintingTask("Make", "Red", "portrait");
            case SHOPPING:
                return new ShoppingTask("Buy", "Milk", 2.0);
            default:
                return null;
        }

    }
}
