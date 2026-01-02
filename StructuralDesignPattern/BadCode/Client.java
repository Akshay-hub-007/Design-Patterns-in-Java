package DesignPatterns.StructuralDesignPattern.BadCode;

public class Client {
    public static void main(String[] args) {

        /*
         *  BAD DESIGN
         *
         * The client is tightly coupled to OldPaymentGateway.
         * If a new payment gateway (e.g., NewPaymentGateway, PayPal, Stripe) is introduced,
         * the client code must be modified to create a new object and call its methods.
         *
         * This violates:
         * - Open–Closed Principle (not open for extension)
         * - Dependency Inversion Principle
         *
         * The client should not depend on concrete payment gateways.
         * Instead, we should introduce an Adapter so that new payment gateways
         * can be integrated without changing client code.
         *
         * Using Adapter Pattern:
         * - Client depends on a common interface
         * - Old and new gateways are adapted to that interface
         * - Client code remains unchanged when new payments are 
         * 
         * 
         * In Future any changes happen in the gateway the client should not knwo
         * about this and will face a problem
         */

        OldPaymentGateway oldPaymentGateway = new OldPaymentGateway();
        oldPaymentGateway.makePayment(10);
    }
}
