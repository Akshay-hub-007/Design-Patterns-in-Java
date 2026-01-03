package DesignPatterns.StructuralDesignPattern.Bridge.GoodCode.NotificationTypes;

import DesignPatterns.StructuralDesignPattern.Bridge.GoodCode.MessageSender;
import DesignPatterns.StructuralDesignPattern.Bridge.GoodCode.Notification;

public class UrgentEmailNotification extends Notification {

    public UrgentEmailNotification(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void notifyUser(String message) {
        messageSender.send(message);
    }

}
