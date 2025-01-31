package com.yaswanth.behavioral.strategy.strategies;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ShortestRouteStrategy implements RouteStrategy {

    @Override
    public void calculateRoute(String start, String end) {
        log.info("Calculating shortest route from {} to {}", start, end);
    }

}
