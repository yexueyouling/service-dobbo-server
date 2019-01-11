package com.example.dubbo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;

@Configuration
public class DubboConfiguration {

	@Bean
	public ApplicationConfig applicationConfig() {
		ApplicationConfig applicationConfig = new ApplicationConfig();
		applicationConfig.setName("service-dUbbo-server");
		return applicationConfig;
	}
	
	@Bean
	public RegistryConfig registryConfig() {
		RegistryConfig registryConfig = new RegistryConfig();
		registryConfig.setAddress("zookeeper://10.19.210.249:2181");
		registryConfig.setClient("curator");
		return registryConfig;
	}
}
