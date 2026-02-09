package org.example;


//  A "Context" class that can be set with a specific concrete execution strategy
//  that it can execute (run)
//
class PaymentStrategyExecutor {
    private PaymentStrategy strategy;

    // Allow changing strategy at runtime
    // Accept a concrete payment strategy that implements
    // the PaymentStrategy interface.
    //
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    // execute the payment using the specific payment strategy
    public void execute(double amount) {
        if (strategy == null) {
            throw new IllegalStateException("Payment strategy not set.");
        }
        strategy.pay(amount);
    }
}
