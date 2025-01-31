package com.yaswanth.behavioral.strategy.strategies;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FastestRouteStrategy implements RouteStrategy{

    @Override
    public void calculateRoute(String start, String end) {
        log.info("Calculating fastest route from {} to {}", start, end);
    }
    
}
