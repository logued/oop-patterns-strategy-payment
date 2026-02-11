package org.example;

// Concrete Strategy 1
// By "concrete" we mean a specific  implementation of a payment
// ( as opposed to the abstract interface )
//
class CreditCardPayment implements PaymentStrategy {
    private final String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    // Implementation of the abstract pay() method from the interface
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card: " + cardNumber);
    }
}
