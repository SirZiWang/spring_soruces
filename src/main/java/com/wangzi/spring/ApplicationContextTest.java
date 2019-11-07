package com.wangzi.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {

	@Test
	public void testAlias() {
//		String configLocation = "application-alias.xml";
//		String configLocation = "application-autowire.xml";
		String configLocation = "application-factory-bean.xml";
//		String configLocation = "application-factory-method.xml";
//		String configLocation = "application-lookup-method.xml";
//		String configLocation = "application-depends-on.xml";
//		String configLocation = "application-bean-post-processor.xml";
//		String configLocation = "application-parent-bean.xml";
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation);
		
//		System.out.println("alias-hello -> " + applicationContext.getBean("alias-hello"));
//		System.out.println("double-alias-hello -> " + applicationContext.getBean("double-alias-hello"));
		
//		System.out.println("service-without-autowire -> " + applicationContext.getBean("service-without-autowire"));
//		System.out.println("service-with-autowire -> " + applicationContext.getBean("service-with-autowire"));
		
		System.out.println("helloFactory -> " + applicationContext.getBean("helloFactory"));
        System.out.println("&helloFactory -> " + applicationContext.getBean("&helloFactory"));
		
//		System.out.println("factory-method -> " + applicationContext.getBean("staticFactory"));
		
//		NewsProvider newsProvider = (NewsProvider) applicationContext.getBean("newsProvider");
//		System.out.println(newsProvider.getNews());
//		System.out.println(newsProvider.getNews());
//		
//		NewsProviderPlus newsProviderPlus = (NewsProviderPlus) applicationContext.getBean("newsProviderPlus");
//		System.out.println(newsProviderPlus.getNews());
//		System.out.println(newsProviderPlus.getNews());
//		
//		NewsProvider newsProviderLookupMethod = (NewsProvider) applicationContext.getBean("newsProviderLookupMethod");
//		System.out.println(newsProviderLookupMethod.getNews());
//		System.out.println(newsProviderLookupMethod.getNews());
		
//		System.out.println("hello -> " + applicationContext.getBean("hello"));
//		System.out.println("hello-child -> " + applicationContext.getBean("hello-child"));
		
		
	}
}
