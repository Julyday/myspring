package com.julyday.myspring.aop;

public class Author implements Person{

	@Override
	public void back(String destination) {
		System.out.println("作者准备"+destination);
		//throw new RuntimeException("老婆打电话让我回家陪她看电影");
	}
	
}
