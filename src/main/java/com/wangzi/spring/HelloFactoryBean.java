package com.wangzi.spring;

import org.springframework.beans.factory.FactoryBean;

public class HelloFactoryBean implements FactoryBean<Hello>{
	
	@Override
	public Hello getObject() throws Exception {
		Hello hello = new Hello();
		hello.setContent("hello");
		return hello;
	}

	@Override
	public Class<?> getObjectType() {
		return Hello.class;
	}
	
	@Override
    public boolean isSingleton() {
        return true;
    }
}
