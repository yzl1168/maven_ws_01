package com.atguigu.ws.service;

public class TestServiceImp implements TestServiceInf {

	@Override
	public String ping() {
		System.err.println("qi dong ws fu wu qi de fang fa");
		return "pong";
	}

}
