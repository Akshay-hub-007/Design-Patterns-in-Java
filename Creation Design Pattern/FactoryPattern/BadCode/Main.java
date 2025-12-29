package FactoryPattern.BadCode;

import FactoryPattern.BadCode.ConcreateClasses.Circle;
import FactoryPattern.BadCode.ConcreateClasses.Rectangle;

public class Main {
    public static void main(String[] args) {

        String s = "Circle";
        Shape shape;
        if(s.equalsIgnoreCase("Circle")) {
            shape = new Circle();
        } else if(s.equalsIgnoreCase("Rectangle")) {
            shape = new Rectangle();
        } else {
            throw new IllegalArgumentException("Unknown Type of the shape");
        }

        shape.draw();   
    }
}
