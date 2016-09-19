package com.julyday.myspring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class BeanTest extends BaseTest{
	
	@Test
	public void testBean(){
		Person author = (Person)context.getBean("author");
		author.eat();
	}
}
