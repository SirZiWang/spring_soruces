package com.wangzi.spring;

import org.springframework.beans.BeansException;

public interface BeanPostProcessor {
	// bean 初始化前的回调方法
    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;

    // bean 初始化后的回调方法    
    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;

}
