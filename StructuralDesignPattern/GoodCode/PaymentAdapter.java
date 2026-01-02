package DesignPatterns.StructuralDesignPattern.GoodCode;

import DesignPatterns.StructuralDesignPattern.GoodCode.Gateway.PaymentGateway;

public class PaymentAdapter implements PaymentProcessor {

    private PaymentGateway gateway;

    public PaymentAdapter(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public void pay(double amount) {
        gateway.makePayment(amount);
    }
}
