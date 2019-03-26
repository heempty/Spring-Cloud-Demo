package com.hwl.cloudeurekaclientdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @Value("${server.port}")
    String port;
    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String helloWorld(){
        System.out.println("server->");
        return "hello world from server port-> " + port;
    }
}
