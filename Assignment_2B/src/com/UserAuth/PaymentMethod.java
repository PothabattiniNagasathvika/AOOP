package com.UserAuth;

public interface PaymentMethod {
    void processPayment();
}

// Concrete Products
class CreditCardPayment implements PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment.");
    }
}

class PayPalPayment implements PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment.");
    }
}

// Abstract Factory
interface PaymentFactory {
    PaymentMethod createPaymentMethod();
}

// Concrete Factories
class CreditCardFactory implements PaymentFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new CreditCardPayment();
    }
}

class PayPalFactory implements PaymentFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new PayPalPayment();
    }
}
