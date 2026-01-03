package DesignPatterns.StructuralDesignPattern.Bridge.GoodCode;

public abstract class Notification {
    public MessageSender messageSender;

    public Notification(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public abstract void notifyUser(String message);
}
