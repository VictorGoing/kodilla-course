package com.kodilla.testing.shape;

public class Triangle implements Shape{
    private double side;
    private double midway;
    private double field;

    public Triangle(double side) {
        this.side = side;
        this.field = side * side;
    }

    public String getShapeName(){
        return Triangle.class.toString();
    }
    public double getField(){
        return field;
    }

}
