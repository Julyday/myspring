package com.julyday.myspring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("小红让博主去如家666房间斗地主");
		Object obj = invocation.proceed();
		System.out.println("博主告诉小红，晚上有事明天再约");
		return obj;
	}

}
