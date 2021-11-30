package com.kodilla.testing.shape;

public class Square implements Shape{
    private double side;
    private double field;
    public Square(double side) {
        this.side = side;
        this.field = side * side;
    }

    public String getShapeName(){
        return Square.class.toString();
    }
    public double getField(){
        return field;
    }

}
