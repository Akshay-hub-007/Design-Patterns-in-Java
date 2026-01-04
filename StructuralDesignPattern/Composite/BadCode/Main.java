package DesignPatterns.StructuralDesignPattern.Composite.BadCode;

public class Main {
    public static void main(String[] args) {

        SimpleTask task1 = new SimpleTask("Complete Coding");
        SimpleTask task2 = new SimpleTask("Write Documentation");

        TaskList projectTasks = new TaskList("Project Tasks");
        projectTasks.addTask(task1);
        projectTasks.addTask(task2);

        TaskList phase1Tasks = new TaskList("Phase 1 Tasks");
        phase1Tasks.addTask(new SimpleTask("Design"));
        phase1Tasks.addTask(new SimpleTask("Implementation"));

        projectTasks.addTask(phase1Tasks);

        projectTasks.display();
    }
}
