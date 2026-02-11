package org.example;    // Feb 2026 - Strategy Pattern

// Demo
// Strategy Pattern allows us to select/change a particular strategy to achieve a task/behaviour.
// Here, the task is to make a payment - expressed by the method pay() defined in an Interface.
// However, we supply, and can swap-out, the specific concrete implementation of how to implement pay()
// (Dependency Injection)
 //
public class Main {
    public static void main(String[] args) {

        PaymentStrategyExecutor paymentExecutor = new PaymentStrategyExecutor();

        // Pay by Credit Card
        // Set a specific concrete payment strategy (credit card) for use by the executor.
        // Then execute the payment.
        //
        paymentExecutor.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        paymentExecutor.execute(250.0);

        // Switch to PayPal payment strategy
        paymentExecutor.setPaymentStrategy(new PayPalPayment("user@example.com"));
        paymentExecutor.execute(99.99);

        // We can add further Payment strategies without changing what already exists.

        //TODO
        // Write a new 'concrete' VisaPayment class that will implement (override) the pay()
        // method to pay by Visa.  Write code in main to set the payment strategy
        // to be VisaPayment and then test it by making a payment.
        // No changes are required in the PaymentStrategyExecutor class
        // and this is the point - it is independent of the concrete payment
        // strategy.

    }
}
