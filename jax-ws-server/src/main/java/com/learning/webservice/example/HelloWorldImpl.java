package com.learning.webservice.example;

import javax.jws.WebService;

/**
 * Created by Ming.Li on 20/10/2015.
 */
//Service Implementation
@WebService(endpointInterface = "com.learning.webservice.example.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

    public String helloWorld(String name) {
        return "Hello World JAX-WS " + name;
    }

}
