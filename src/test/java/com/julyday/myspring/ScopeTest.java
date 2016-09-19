package com.julyday.myspring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class ScopeTest extends BaseTest{
	
	@Test
	public void testBean(){
		Person p1 = (Person)context.getBean("author");
		p1.eat();
		Person p2 = (Person)context.getBean("author");
		p2.eat();
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		
		Person p3 = (Person)context.getBean("american");
		p3.eat();
		Person p4 = (Person)context.getBean("american");
		p4.eat();
		System.out.println(p3.hashCode());
		System.out.println(p4.hashCode());
	
	}
}
