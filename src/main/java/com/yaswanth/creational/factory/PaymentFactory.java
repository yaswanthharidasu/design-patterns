package com.yaswanth.creational.factory;

enum PaymentType {
    UPI,
    CREDIT_CARD
}

public class PaymentFactory {
    public static Payment getPaymentObPayment(PaymentType paymentType) {
        if (paymentType.equals(PaymentType.UPI)) {
            return new UPIPayment("9876543210@ybl");
        }
        else if (paymentType.equals(PaymentType.CREDIT_CARD)){
            return new CreditCardPayment("9876-5432-1000-0000", "John");
        }
        else {
            throw new IllegalArgumentException("Invalid payment type");
        }
    }
}
