package FactoryPattern.GoodCode.ShapeFactoryClasses;

import FactoryPattern.GoodCode.ConcreateClasses.Circle;
import FactoryPattern.GoodCode.Shape;
import FactoryPattern.GoodCode.ShapeFactory;

public class CircleShapeFactory implements ShapeFactory {

    public Shape getShape() {
        return new Circle();
    }
    
}
