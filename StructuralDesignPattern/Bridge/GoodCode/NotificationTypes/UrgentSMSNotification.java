package DesignPatterns.StructuralDesignPattern.Bridge.GoodCode.NotificationTypes;

import DesignPatterns.StructuralDesignPattern.Bridge.GoodCode.MessageSender;
import DesignPatterns.StructuralDesignPattern.Bridge.GoodCode.Notification;

public class UrgentSMSNotification  extends Notification{

    public UrgentSMSNotification(MessageSender messageSender) {
        super(messageSender);
    }
    @Override
    public void notifyUser(String message) {
       messageSender.send(message);
    }
    
}
