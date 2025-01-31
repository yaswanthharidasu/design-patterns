package com.yaswanth.behavioral.observer.subscriber;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GeneralSubscriber implements Subscriber{

    @Override
    public void update(String news) {
        log.info("I received news: {}", news);
    }
    
}
