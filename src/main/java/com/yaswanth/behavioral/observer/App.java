package com.yaswanth.behavioral.observer;

import com.yaswanth.behavioral.observer.subscriber.GeneralSubscriber;
import com.yaswanth.behavioral.observer.subscriber.TechSubscriber;

public class App {
    public static void main(String[] args) {
        NewsPublisher newsPublisher = new NewsPublisher();
        newsPublisher.addSubscriber(new GeneralSubscriber());
        newsPublisher.addSubscriber(new TechSubscriber());
    
        newsPublisher.publishNews("Sports: Local team wins championship!");
        newsPublisher.publishNews("Tech: DeepSeek AI is launched");
    }
}
