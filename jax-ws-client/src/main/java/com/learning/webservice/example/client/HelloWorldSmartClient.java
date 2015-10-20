package com.learning.webservice.example.client;

import com.learning.webservice.example.HelloWorld;
import com.learning.webservice.example.HelloWorldImplService;
import com.learning.webservice.example.HelloWorld_Type;

/**
 * Created by Ming.Li on 20/10/2015.
 */
public class HelloWorldSmartClient {

    public static void main(String[] args) {
        HelloWorldImplService helloService = new HelloWorldImplService();
        HelloWorld hello = helloService.getHelloWorldImplPort();
        System.out.println(hello.helloWorld("\"Real\" Ming"));
    }
}
