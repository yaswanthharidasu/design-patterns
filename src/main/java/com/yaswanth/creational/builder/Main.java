package com.yaswanth.creational.builder;

public class Main 
{
    public static void main( String[] args )
    {
        HttpRequest request1 = new HttpRequest.HttpRequestBuilder("google.com", Method.POST)
            .setBody("body")
            .build();
        request1.sendRequest();

        HttpRequest request2 = new HttpRequest.HttpRequestBuilder("google.com", Method.GET)
            .build();
        request2.sendRequest();
    }
}
