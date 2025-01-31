package com.yaswanth.creational.factory;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@Setter
public class CreditCardPayment implements Payment{
    private String cardNumber;
    private String cardHolder;

    @Override
    public void pay(int amount){
        log.info("{} paid {} using card {}", this.cardHolder, amount, this.cardNumber);
    }
}
