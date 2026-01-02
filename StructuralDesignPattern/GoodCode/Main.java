package DesignPatterns.StructuralDesignPattern.GoodCode;

import DesignPatterns.StructuralDesignPattern.GoodCode.Gateway.OldPaymentGateway;
import DesignPatterns.StructuralDesignPattern.GoodCode.Gateway.NewPaymentGateway;

public class Main {
    public static void main(String[] args) {

        PaymentProcessor processor = new PaymentAdapter(new OldPaymentGateway());

        processor.pay(20);

        // Switch gateway WITHOUT client change
        processor = new PaymentAdapter(new NewPaymentGateway());

        processor.pay(50);
    }
}
