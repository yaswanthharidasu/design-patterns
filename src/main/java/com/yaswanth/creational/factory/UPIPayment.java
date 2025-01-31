package com.yaswanth.creational.factory;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class UPIPayment implements Payment{
    private String upiID;

    @Override
    public void pay(int amount) {
        log.info("Payment done of amount {} using upiID {}", amount, this.upiID);
    }
}
