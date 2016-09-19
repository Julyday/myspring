package com.julyday.myspring.aop.schema;

import org.aspectj.lang.ProceedingJoinPoint;

public class AuthorAspect {

	public void before() {
		System.out.println("AuthorAspect before.");
	}

	public void afterReturning() {
		System.out.println("AuthorAspect afterReturning.");
	}

	public void afterThrowing() {
		System.out.println("AuthorAspect afterThrowing.");
	}

	public void after() {
		System.out.println("AuthorAspect after.");
	}

	public Object around(ProceedingJoinPoint pjp) {
		Object obj = null;
		try {
			System.out.println("AuthorAspect around 1.");
			obj = pjp.proceed();
			System.out.println("AuthorAspect around 2.");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return obj;
	}

}
