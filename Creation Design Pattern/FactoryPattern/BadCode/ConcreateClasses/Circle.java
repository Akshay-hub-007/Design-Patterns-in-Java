package FactoryPattern.BadCode.ConcreateClasses;
import FactoryPattern.BadCode.*;;
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
    
}
