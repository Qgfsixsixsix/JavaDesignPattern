package com.design.pattern.behavioral.observer;

public class Main {
	public static void main(String[] args) {
		Persion persion = new Persion();
		//ע��۲���
		persion.addObserver(new MyObserver());
		persion.setName("lifengxing");
		persion.setAge(23);
		persion.setSex("��");
	}

}
