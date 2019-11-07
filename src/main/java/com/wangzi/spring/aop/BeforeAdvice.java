package com.wangzi.spring.aop;

import java.lang.reflect.Method;

public class BeforeAdvice implements Advice{
	
	private Object bean;
	private MethodInvocation methodInvocation;
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		methodInvocation.invoke();
		return method.invoke(bean, args);
	}

	public BeforeAdvice(Object bean, MethodInvocation methodInvocation) {
		super();
		this.bean = bean;
		this.methodInvocation = methodInvocation;
	}
}
