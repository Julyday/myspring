package com.julyday.myspring;

public class Lisi implements Person {

	public void init(){
		System.out.println("Lisi带礼物去看朋友");
	}
	
	@Override
	public void eat() {
		System.out.println("Lisi喝了二两白酒");
	}
	
	public void destroy(){
		System.out.println("Lisi喝多了");
	}
}
