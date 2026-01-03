package DesignPatterns.StructuralDesignPattern.Bridge.BadCode;

public class EmailNotification implements Notification{

    @Override
    public void send(String message) {
        System.out.println("message send through Email");
    }
    
}