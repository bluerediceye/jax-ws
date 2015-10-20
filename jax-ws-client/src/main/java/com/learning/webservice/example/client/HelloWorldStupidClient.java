package com.learning.webservice.example.client;

import com.learning.webservice.example.HelloWorld;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Ming.Li on 20/10/2015.
 */
public class HelloWorldStupidClient {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8080/ws/HelloWorld?wsdl");
        QName qName = new QName("http://example.webservice.learning.com/", "HelloWorldImplService");

        Service service = Service.create(url, qName);
        HelloWorld helloWorld = service.getPort(HelloWorld.class);
        System.out.println(helloWorld.helloWorld("\"Not very\" Ming"));
    }
}
