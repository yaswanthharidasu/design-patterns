package com.yaswanth.behavioral.observer;

import java.util.ArrayList;
import java.util.List;
import com.yaswanth.behavioral.observer.subscriber.Subscriber;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NewsPublisher {
    private final List<Subscriber> subscribers = new ArrayList<>();

    public void addSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    public void notify(String news){
        for(Subscriber subscriber: subscribers){
            subscriber.update(news);
        }
    }

    public void publishNews(String news){
        log.info("Breaking news: {}", news);
        notify(news);
    }
}
