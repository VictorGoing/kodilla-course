package com.kodilla.testing.shape;

public class Circle implements Shape{
    private double radius;
    private double field;
    public Circle(double radius) {
        this.radius = radius;
        this.field = (radius * radius) * Math.PI;
    }

    public String getShapeName(){
        return Circle.class.toString();
    }
    public double getField(){
        return field;
    }

}
