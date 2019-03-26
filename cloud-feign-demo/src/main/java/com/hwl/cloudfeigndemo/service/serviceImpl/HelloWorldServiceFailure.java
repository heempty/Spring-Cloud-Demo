package com.hwl.cloudfeigndemo.service.serviceImpl;

import com.hwl.cloudfeigndemo.service.HelloWorldService;
import org.springframework.stereotype.Service;

//实现被@FeignClient修饰的HelloWorldService接口
//注意添加@Component或者@Service注解，在Spring容器中生成一个Bean
@Service
public class HelloWorldServiceFailure implements HelloWorldService {
    @Override
    public String sayHello() {
        System.out.println("hello world service is not available !");
        return "hello world service is not available !";
    }
}
