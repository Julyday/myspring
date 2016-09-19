package com.julyday.myspring.aop.schema;

import org.junit.After;
import org.junit.Before;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseTest {
	public ClassPathXmlApplicationContext context;
	
	@Before
	public void before() {
		try {
			context = new ClassPathXmlApplicationContext("spring-aop-schema-advice.xml");
			context.start();
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}
	
	@After
	public void after() {
		context.destroy();
	}
}
