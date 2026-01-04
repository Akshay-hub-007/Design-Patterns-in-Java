package DesignPatterns.StructuralDesignPattern.Composite.BadCode;

public class SimpleTask {
    private String title;

    public SimpleTask(String title) {
        this.title = title;
    }

    public void display() {
        System.out.println("Simple Task: " + title);
    }
}
