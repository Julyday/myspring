package com.julyday.myspring.annotation;

import org.junit.Test;
import com.julyday.myspring.annotation.Lisi;

public class LazyTest extends BaseTest {
	@Test
	public void testBean(){
//		Zhangsan zhangsan = (Zhangsan)context.getBean("zhangsan");
//		zhangsan.eat();
		Lisi lisi = (Lisi)context.getBean("lisi");
		lisi.eat();
	}
}	
