package com.yaswanth.behavioral.chain_of_responsibility;

import com.yaswanth.behavioral.chain_of_responsibility.handlers.AuthHandler;
import com.yaswanth.behavioral.chain_of_responsibility.handlers.CorsHandler;
import com.yaswanth.behavioral.chain_of_responsibility.handlers.RequestTypeHandler;

public class App {
    public static void main(String[] args) {
        RequestManager requestManager = new RequestManager();
        requestManager.addHandler(new AuthHandler());
        requestManager.addHandler(new CorsHandler());
        requestManager.addHandler(new RequestTypeHandler());

        HttpRequest httpRequest = new HttpRequest("/data", "admin", "admin123", "GET", "https://example.com");
        requestManager.process(httpRequest);
    }
}
