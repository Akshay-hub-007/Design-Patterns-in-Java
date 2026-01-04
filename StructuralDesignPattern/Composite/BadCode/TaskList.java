package DesignPatterns.StructuralDesignPattern.Composite.BadCode;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private String title;
    private List<Object> tasks = new ArrayList<>();

    public  TaskList(String title) {
        this.title = title;
    }

    public void addTask(Object task) {
        tasks.add(task);
    }

    public void display() {
        System.out.println("Task Title: " + title);

        for (Object task : tasks) {
            if (task instanceof SimpleTask) {
                ((SimpleTask) task).display();
            } else if (task instanceof TaskList) {
                ((TaskList) (task)).display();
            } else {
                throw new RuntimeException("Unknown Class Type");
            }
        }
    }

}
