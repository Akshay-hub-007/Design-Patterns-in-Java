package DesignPatterns.StructuralDesignPattern.Adapter.GoodCode;

import DesignPatterns.StructuralDesignPattern.Adapter.GoodCode.Gateway.NewPaymentGateway;
import DesignPatterns.StructuralDesignPattern.Adapter.GoodCode.Gateway.OldPaymentGateway;

public class Main {
    
    public static void main(String[] args) {

        PaymentProcessor processor = new PaymentAdapter(new OldPaymentGateway());

        processor.pay(20);

        // Switch gateway WITHOUT client change
        processor = new PaymentAdapter(new NewPaymentGateway());

        processor.pay(50);
    }
}
