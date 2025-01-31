package com.yaswanth.behavioral.strategy.strategies;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ScenicRouteStrategy implements RouteStrategy {

    @Override
    public void calculateRoute(String start, String end) {
        log.info("Calculating scenic route from {} to {}", start, end);
    }
    
}
