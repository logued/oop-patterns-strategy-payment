package org.example;

// Concrete Strategy 1
// By "concrete" we mean an actual real implementation
// ( as opposed to the abstract interface )
class CreditCardPayment implements PaymentStrategy {
    private final String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card: " + cardNumber);
    }
}
