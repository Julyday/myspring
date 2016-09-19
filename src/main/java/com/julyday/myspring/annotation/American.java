package com.julyday.myspring.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.julyday.myspring.Person;

@Component
@Scope("prototype")
public class American implements Person{
	
	@Override
	public void eat() {
		System.out.println("美国人喜欢吃牛肉");
	}
}
