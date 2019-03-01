package com.design.pattern.structural.decorator.v1;

public class Test {
	public static void main(String[] args) {
		Battercake battercake = new Battercake();
		System.out.println(battercake.getDesc() + "���ۼ۸�" + battercake.cost());
		
		Battercake battercakeWithEgg = new BattercakeWithEgg();
		System.out.println(battercakeWithEgg.getDesc() + "���ۼ۸�" + battercakeWithEgg.cost());
		
		Battercake battercakeWithEggSansage = new BattercakeWithEggSansage();
		System.out.println(battercakeWithEggSansage.getDesc() + "���ۼ۸�" + battercakeWithEggSansage.cost());
	}
}
