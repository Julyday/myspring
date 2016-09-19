package com.julyday.myspring.aop.aspectj;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.julyday.myspring.aop.Person;

@RunWith(BlockJUnit4ClassRunner.class)
public class AspectjTest extends BaseTest{
	@Test
	public void aspectjApi(){
		Person p = (Person)context.getBean("author");
		p.back("去打牌");
	}
}
