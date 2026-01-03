package DesignPatterns.StructuralDesignPattern.Adapter.BadCode;

public class OldPaymentGateway {
    public void makePayment(double amount) {
        System.out.println("Paid using old gateway: " + amount);
    }
}
