package com.design.pattern.behavioral.observer;

public class Main {
	public static void main(String[] args) {
		Persion persion = new Persion();
		//×¢²á¹Û²ìÕß
		persion.addObserver(new MyObserver());
		persion.setName("lifengxing");
		persion.setAge(23);
		persion.setSex("ÄÐ");
	}

}
