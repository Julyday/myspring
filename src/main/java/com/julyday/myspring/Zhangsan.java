package com.julyday.myspring;

public class Zhangsan implements Person {

	public void init(){
		System.out.println("Zhangsan带礼物去看朋友");
	}
	
	@Override
	public void eat() {
		System.out.println("Zhangsan吃了一碗饭");
	}
	
	public void destroy(){
		System.out.println("Zhangsan聊的很开心");
	}

}
