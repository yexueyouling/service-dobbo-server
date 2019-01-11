package com.example.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;

@SpringBootApplication
@DubboComponentScan(basePackages = "com.example.dubbo.service.impl")
public class ServiceDobboServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDobboServerApplication.class, args);
	}

}

