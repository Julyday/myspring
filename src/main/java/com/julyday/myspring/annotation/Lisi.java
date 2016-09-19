package com.julyday.myspring.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

import com.julyday.myspring.Person;

@Component
public class Lisi implements Person{
	
	@PostConstruct
	public void init(){
		System.out.println("Lisi带礼物去看朋友");
	}
	
	@Override
	public void eat() {
		System.out.println("Lisi喝了二两白酒");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("Lisi喝多了");
	}
}
