package com.example.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;

@Service(timeout = 5000)
public class DemoServerImpl implements IDemoServer {

	@Override
	public String hello(String name) {

		return "hello:" + name;
	}

}
