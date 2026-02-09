package org.example;

// Strategy Interface
//
// A concrete payment strategy must implement this interface
// in order that it can be used in the PaymentStrategyExecutor
//
interface PaymentStrategy {
    void pay(double amount);
}

