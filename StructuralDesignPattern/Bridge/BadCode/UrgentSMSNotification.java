package DesignPatterns.StructuralDesignPattern.Bridge.BadCode;

public class UrgentSMSNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("message send through Urgent SMS Notification");
    }

}
