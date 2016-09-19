package com.julyday.myspring.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.julyday.myspring.Person;

@Lazy(false)
@Component
public class Zhangsan implements Person{
	
	@PostConstruct
	public void init(){
		System.out.println("Zhangsan带礼物去看朋友");
	}
	
	@Override
	public void eat() {
		System.out.println("Zhangsan吃了一碗饭");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("Zhangsan聊的很开心");
	}
}
