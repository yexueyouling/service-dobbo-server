package com.example.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;

@Service(version = "${demo.service.version}", application = "${dubbo.application.id}", protocol = "${dubbo.protocol.id}", registry = "${dubbo.registry.id}")
public class DemoServerImpl implements IDemoServer {

	@Override
	public String hello(String name) {

		return "hello:" + name;
	}

}
