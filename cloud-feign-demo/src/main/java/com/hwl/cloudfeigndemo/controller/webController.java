package com.hwl.cloudfeigndemo.controller;

import com.hwl.cloudfeigndemo.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class webController {

    @Autowired
    HelloWorldService helloWorldService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello(){
        System.out.println("-->> feign <<--");
        return helloWorldService.sayHello();
    }

}
