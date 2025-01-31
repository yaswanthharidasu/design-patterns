package com.yaswanth.behavioral.strategy;

import com.yaswanth.behavioral.strategy.strategies.RouteStrategy;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class NavigationSystem {
    public RouteStrategy routeStrategy;

    public void setRouteStrategy(RouteStrategy strategy){
        this.routeStrategy = strategy;
    }

    public void navigate(String start, String end) {
        routeStrategy.calculateRoute(start, end);
    }
}
