package DesignPatterns.StructuralDesignPattern.Composite.GoodCode;

public class SimpleTask implements Task {
    String title;

    public SimpleTask(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void display() {
        System.out.println("Simple Task: " + this.title);
    }

}
