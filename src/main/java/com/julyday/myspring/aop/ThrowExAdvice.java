package com.julyday.myspring.aop;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class ThrowExAdvice implements ThrowsAdvice{
	
	public void afterThrowing(Exception ex) throws Throwable {
		System.out.println("ThrowExAdvice afterThrowing 1"+ex.getMessage());
	}
	
	public void afterThrowing(Method method, Object[] args, Object target, Exception ex) throws Throwable {
		System.out.println("ThrowExAdvice afterThrowing 2 : " + ex.getMessage());
	}
}
