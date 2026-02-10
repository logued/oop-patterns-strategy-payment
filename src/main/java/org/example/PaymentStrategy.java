package org.example;

// Strategy Interface
//
// A concrete payment strategy must implement this interface
// in order that it can be used by the PaymentStrategyExecutor
//
interface PaymentStrategy {
    void pay(double amount);
}

// All payment strategies must allow us to call pay(),
// but the exact details of how that payment is to be conducted
// is coded in the concrete payment class.