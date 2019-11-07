package com.wangzi.spring;

public class StaticFactory {
	
	public static Hello getHello() {
		Hello hello = new Hello();
		hello.setContent("created by StaticHelloFactory");
		return hello;
	}
	
	public Hello getHello1(){
		Hello hello = new Hello();
		hello.setContent("created by StaticHelloFactory");
		return hello;
	}
}
