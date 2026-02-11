package org.example;

// Concrete Strategy 2
// A specific (concrete) payment mechanism

class PayPalPayment implements PaymentStrategy {
    private final String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    // Implementation of the abstract pay() method from the interface
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal account: " + email);
    }
}