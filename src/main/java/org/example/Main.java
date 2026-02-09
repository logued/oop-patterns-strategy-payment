package org.example;    // Feb 2026 - Strategy Pattern

// Demo
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

    }
}
