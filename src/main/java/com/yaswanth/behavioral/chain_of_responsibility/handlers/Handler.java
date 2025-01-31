package com.yaswanth.behavioral.chain_of_responsibility.handlers;

import com.yaswanth.behavioral.chain_of_responsibility.HttpRequest;

public interface Handler {
    boolean handle(HttpRequest request);
}
