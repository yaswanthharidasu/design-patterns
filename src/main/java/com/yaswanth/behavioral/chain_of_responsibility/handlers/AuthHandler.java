package com.yaswanth.behavioral.chain_of_responsibility.handlers;

import java.util.HashMap;
import java.util.Map;
import com.yaswanth.behavioral.chain_of_responsibility.HttpRequest;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AuthHandler implements Handler{
    private static final Map<String, String> validUsers = new HashMap<>();

    static {
        validUsers.put("admin", "admin123");
        validUsers.put("user1", "password1");
        validUsers.put("user2", "password2");
    }

    @Override
    public boolean handle(HttpRequest request) {
        if(validUsers.containsKey(request.getUsername()) && validUsers.get(request.getUsername()).equals(request.getPassword())){
            log.info("authentication successful");
            return true;
        }
        log.warn("authentication failed");
        return false;
    }
}
