package com.julyday.myspring.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		System.out.println("各位朋友再见！");
		String argString = "";
		if(args.length > 0){
			for(Object obj : args){
				argString += obj.toString();
			}
		}
		System.out.println("BeforeAdvice before : method : "+method.getName() 
				+" args : "+argString+" target : "+target.getClass().getName());
	}

}
