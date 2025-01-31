package com.yaswanth.behavioral.chain_of_responsibility;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class HttpRequest {
    private String url;
    private String username;
    private String password;
    private String requestType;
    private String origin;
}
