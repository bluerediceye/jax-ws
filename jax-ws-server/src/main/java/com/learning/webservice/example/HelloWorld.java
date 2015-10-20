package com.learning.webservice.example;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by Ming.Li on 20/10/2015.
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HelloWorld{

    @WebMethod
    String helloWorld(String name);
}