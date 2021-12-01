package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class    ShapeCollectorTestSuite {

    @Test
    void testAddFigure(){
        Circle circle = new Circle(2.5);
        ShapeColletor collector = new ShapeColletor();
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(circle);
        collector.addFigure(circle);

        Assertions.assertEquals(shapeList,collector.collection);
    }

    @Test
    void testRemoveFigure(){
        Circle circle = new Circle(2.5);

        ShapeColletor collector = new ShapeColletor();
        List<Shape> shapeList = new ArrayList<>();

        collector.collection.add(circle);
        collector.removeFigure(circle);

        Assertions.assertEquals(shapeList,collector.collection);

    }

    @Test
    void testGetFigure(){
        Circle circle = new Circle(2.5);
        ShapeColletor collector = new ShapeColletor();

        collector.collection.add(circle);

        Assertions.assertEquals(circle,collector.getFigure(0));
    }

}
