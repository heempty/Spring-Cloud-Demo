package com.hwl.cloudfeigndemo.service;

import com.hwl.cloudfeigndemo.service.serviceImpl.HelloWorldServiceFailure;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*fallback 使用Feign内置提供的hystrix 熔断器
    必须实现被@FeignClient修饰的HelloWorldService接口*/
@FeignClient(value = "SERVICE-CLIENT",fallback = HelloWorldServiceFailure.class)
public interface HelloWorldService {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String sayHello();
}
