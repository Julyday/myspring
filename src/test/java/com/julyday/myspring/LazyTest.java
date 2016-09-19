package com.julyday.myspring;

import org.junit.Test;

public class LazyTest extends BaseTest {
	@Test
	public void testBean(){
//		Zhangsan zhangsan = (Zhangsan)context.getBean("zhangsan");
//		zhangsan.eat();
		Lisi lisi = (Lisi)context.getBean("lisi");
		lisi.eat();
	}
}	
