package DesignPatterns.StructuralDesignPattern.Bridge.BadCode;

public class UrgentEmailNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("message send through Urgent Email Notification");
    }

}
