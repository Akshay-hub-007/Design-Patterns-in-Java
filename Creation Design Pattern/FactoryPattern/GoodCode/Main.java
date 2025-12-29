package FactoryPattern.GoodCode;

import FactoryPattern.GoodCode.ShapeFactoryClasses.CircleShapeFactory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new CircleShapeFactory();
        Shape shape = shapeFactory.getShape();
        shape.draw();
    }
}
