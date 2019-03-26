package com.hwl.cloudfeigndemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

// @EnableFeignClients注解以使用Feign， 使用@EnableDiscoveryClient开启服务自动发现
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CloudFeignDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudFeignDemoApplication.class, args);
	}

}
