package com.yaswanth.creational.factory;

public class Main {
    public static void main(String[] args) {
        Payment payment = PaymentFactory.getPaymentObPayment(PaymentType.UPI);
        payment.pay(100);
    }
}
