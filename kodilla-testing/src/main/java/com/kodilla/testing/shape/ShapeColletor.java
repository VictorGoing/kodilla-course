package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeColletor {
    private List<Shape> collection = new ArrayList<>();

    public List<Shape> getCollection() {
        return collection;
    }

    public void addFigure(Shape shape){

    }

    public void removeFigure(Shape shape){
        this.collection.add(shape);
    }

    public Shape getFigure(int n){
        return null;
    }

    public void showFigures(){

    }

}
