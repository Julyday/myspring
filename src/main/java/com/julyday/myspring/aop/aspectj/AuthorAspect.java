package com.julyday.myspring.aop.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AuthorAspect {
	
	@Pointcut("execution(* com.julyday.myspring.aop.aspectj.Author.*(..))")
	public void pointcut(){}
	
	@Before("execution(* com.julyday.myspring.aop.aspectj.Author.*(..))")
	public void before() {
		System.out.println("AuthorAspect before.");
	}
	
	@AfterReturning(value="pointcut()")
	public void afterReturning() {
		System.out.println("AuthorAspect afterReturning.");
	}
	
	@AfterThrowing("pointcut()")
	public void afterThrowing() {
		System.out.println("AuthorAspect afterThrowing.");
	}
	
	@After("pointcut()")
	public void after() {
		System.out.println("AuthorAspect after.");
	}

	@Around("pointcut()")
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
