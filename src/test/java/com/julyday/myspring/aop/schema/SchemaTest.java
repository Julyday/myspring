package com.julyday.myspring.aop.schema;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.julyday.myspring.aop.Person;

@RunWith(BlockJUnit4ClassRunner.class)
public class SchemaTest extends BaseTest{
	@Test
	public void testApi(){
		Person p = (Person)context.getBean("author");
		p.back("去打牌");
	}
}
