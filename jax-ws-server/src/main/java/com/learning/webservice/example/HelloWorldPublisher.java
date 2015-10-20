package com.learning.webservice.example;

import javax.xml.ws.Endpoint;

/**
 * Created by Ming.Li on 20/10/2015.
 */
public class HelloWorldPublisher {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/ws/HelloWorld", new HelloWorldImpl());
    }
}
