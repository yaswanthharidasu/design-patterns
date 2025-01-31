package com.yaswanth.behavioral.strategy;

import com.yaswanth.behavioral.strategy.strategies.FastestRouteStrategy;
import com.yaswanth.behavioral.strategy.strategies.ScenicRouteStrategy;
import com.yaswanth.behavioral.strategy.strategies.ShortestRouteStrategy;

public class App {
    public static void main(String[] args) {
        NavigationSystem navigationSystem = new NavigationSystem(new FastestRouteStrategy());
        navigationSystem.navigate("A", "B");
    
        // Chaning strategy to ShortestRouteStrategy
        navigationSystem.setRouteStrategy(new ShortestRouteStrategy());
        navigationSystem.navigate("A", "B");

        // Chaning strategy to ScenicRouteStrategy
        navigationSystem.setRouteStrategy(new ScenicRouteStrategy());
        navigationSystem.navigate("A", "B");
    }
}
