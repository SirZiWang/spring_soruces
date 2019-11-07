package com.wangzi.spring;

import org.springframework.beans.BeansException;

public class LoggerBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		 System.out.println("Before " + beanName + " Initialization");
	     return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("after " + beanName + " Initialization");
	     return bean;
	}

}
