package com.yaswanth.creational.builder;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Setter
@Slf4j
public class HttpRequest {
    private final String url;
    private final Method method;
    private final String body;

    public HttpRequest(HttpRequestBuilder builder) {
        this.url = builder.url;
        this.method = builder.method;
        this.body = builder.body;
    }

    public void sendRequest(){
        log.info("Sending {} request to {} url with body {}", this.method, this.url, this.body);
    }

    public static class HttpRequestBuilder {
        private final String url;    
        private final Method method;
        private String body;

        public HttpRequestBuilder(String url, Method method) {
            if(url == null || method == null){
                throw new IllegalArgumentException("url and method cannot be null");
            }
            this.url = url;
            this.method = method;
        }

        public HttpRequestBuilder setBody(String body) {
            if(method.equals(Method.GET)){
                throw new IllegalArgumentException("body cannot be set to GET request");
            }
            this.body = body;
            return this;
        }

        public HttpRequest build() {
            return new HttpRequest(this);
        }
    }
}

enum Method {
    GET,
    POST
}
