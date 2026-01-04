package DesignPatterns.StructuralDesignPattern.Bridge.GoodCode;

import DesignPatterns.StructuralDesignPattern.Bridge.GoodCode.NotificationTypes.UrgentEmailNotification;
import DesignPatterns.StructuralDesignPattern.Bridge.GoodCode.Sender.EmailSender;

public class Main {
    public static void main(String[] args) {
        MessageSender  messageSender = new EmailSender();

        Notification notification = new UrgentEmailNotification(messageSender);
        notification.notifyUser("hello...");
    }    
}
