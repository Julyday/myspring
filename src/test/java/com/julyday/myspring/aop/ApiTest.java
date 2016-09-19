package com.julyday.myspring.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class ApiTest extends BaseTest{
	@Test
	public void testApi(){
		Person p = (Person)context.getBean("author");
		p.back("去打牌");
	}
}
