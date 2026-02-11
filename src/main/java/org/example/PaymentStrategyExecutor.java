package org.example;


//  A "Context" class that can be set with a specific concrete execution strategy
//  that it can execute (run)   (Dependency Injection)
//
class PaymentStrategyExecutor {

    private PaymentStrategy _strategy;  // underscore indicates an instance variable (field)

    // Allow changing of the strategy at runtime
    // Accept a concrete payment strategy that implements
    // the PaymentStrategy interface.
    //
    public void setPaymentStrategy(PaymentStrategy strategy) {
        _strategy = strategy;
    }

    // execute the payment using the specific payment strategy
    //
    public void execute(double amount) {
        if ( _strategy == null ) {
            throw new IllegalStateException("Payment strategy not set.");
        }
        _strategy.pay(amount);  // calls the 'concrete' implementation
    }
}
