package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class    ShapeCollectorTestSuite {

    @Test
    void testAddFigure(){
        Circle circle = new Circle(2.5);
        ShapeColletor colletor = new ShapeColletor();
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(circle);
        colletor.addFigure(circle);

        Assertions.assertEquals(shapeList,colletor.getCollection());
    }

    @Test
    void testRemoveFigure(){
        Circle circle = new Circle(2.5);
        List<Shape> shapeList = new ArrayList<>();
        ShapeColletor colletor = new ShapeColletor();

        colletor.removeFigure(circle);

        Assertions.assertEquals(shapeList,colletor.getCollection());


    }

    @Test
    void testGetFigure(){
        Circle circle = new Circle(2.5);
        ShapeColletor colletor = new ShapeColletor();

        colletor.addFigure(circle);

        Assertions.assertEquals(circle,colletor.getFigure(0));
    }

}
