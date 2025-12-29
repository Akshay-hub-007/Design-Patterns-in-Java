package FactoryPattern.GoodCode.ConcreateClasses;

import FactoryPattern.GoodCode.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        
        System.out.println("Drawing Rectangle");
    }
    
}
