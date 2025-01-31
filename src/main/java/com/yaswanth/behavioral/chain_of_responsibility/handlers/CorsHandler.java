package com.yaswanth.behavioral.chain_of_responsibility.handlers;

import java.util.Arrays;
import java.util.List;
import com.yaswanth.behavioral.chain_of_responsibility.HttpRequest;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CorsHandler implements Handler{
    private static final List<String> ALLOWED_ORIGINS = Arrays.asList("https://example.com");

    @Override
    public boolean handle(HttpRequest request) {
        String origin = request.getOrigin();
        if(origin != null && ALLOWED_ORIGINS.contains(origin)){
            log.info("origin {} is allowed", origin);
            return true;
        }
        log.warn("origin {} is not allowed", origin);
        return false;
    }
    
}
