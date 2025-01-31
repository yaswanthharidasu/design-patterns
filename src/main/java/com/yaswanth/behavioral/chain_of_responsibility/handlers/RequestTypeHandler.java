package com.yaswanth.behavioral.chain_of_responsibility.handlers;

import com.yaswanth.behavioral.chain_of_responsibility.HttpRequest;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RequestTypeHandler implements Handler{

    @Override
    public boolean handle(HttpRequest request) {
        String requestType = request.getRequestType();
        if(requestType.equals("GET") || requestType.equals("POST")){
            log.info("{} request is allowed", requestType);
            return true;
        }
        log.warn("{} request is not allowed", requestType);
        return false;
    }
    
}
