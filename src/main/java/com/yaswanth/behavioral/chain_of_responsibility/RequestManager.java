package com.yaswanth.behavioral.chain_of_responsibility;

import java.util.ArrayList;
import java.util.List;
import com.yaswanth.behavioral.chain_of_responsibility.handlers.Handler;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RequestManager {
    private final List<Handler> handlers = new ArrayList<>();

    public void addHandler(Handler handler) {
        handlers.add(handler);
    }

    public void process(HttpRequest request) {
        for (Handler handler : handlers) {
            if (!handler.handle(request)) {
                log.info("Request processing stopped.");
                return; // Stop further execution
            }
        }
        log.warn("Request processed successfully.\n");
    }
}
