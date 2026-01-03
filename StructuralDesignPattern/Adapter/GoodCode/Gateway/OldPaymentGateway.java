package DesignPatterns.StructuralDesignPattern.Adapter.GoodCode.Gateway;

public class OldPaymentGateway implements PaymentGateway {
    public void makePayment(double amount) {
        System.out.println("Paid using old gateway: " + amount);
    }
}
