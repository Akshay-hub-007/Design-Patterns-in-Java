package DesignPatterns.StructuralDesignPattern.Bridge.GoodCode.Sender;

import DesignPatterns.StructuralDesignPattern.Bridge.GoodCode.MessageSender;

public class EmailSender implements MessageSender {

    @Override
    public void send(String message) {
        System.out.println("Message send through Email Sender");
    }
    
}
