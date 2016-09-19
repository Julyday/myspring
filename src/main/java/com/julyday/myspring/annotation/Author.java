package com.julyday.myspring.annotation;

import org.springframework.stereotype.Component;

import com.julyday.myspring.Person;

@Component
public class Author implements Person{

	@Override
	public void eat() {
		System.out.println("作者喜欢吃肉");
	}
	
}
