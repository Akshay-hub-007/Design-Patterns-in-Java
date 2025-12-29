package FactoryPattern.GoodCode.ShapeFactoryClasses;

import FactoryPattern.GoodCode.Shape;
import FactoryPattern.GoodCode.ShapeFactory;
import FactoryPattern.GoodCode.ConcreateClasses.Rectangle;

public class ReactangleFactory implements ShapeFactory{

    @Override
    public Shape getShape() {
        return new Rectangle();
    }
    
}
