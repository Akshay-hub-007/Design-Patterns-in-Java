package DesignPatterns.StructuralDesignPattern.GoodCode.Gateway;

public class NewPaymentGateway implements PaymentGateway{
    public void makePayment(double amount) {
        System.out.println("Paymet done with new Gateway " + amount);
    }   
}
