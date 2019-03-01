package com.design.pattern.structural.decorator.v1;

public class Test {
	public static void main(String[] args) {
		Battercake battercake = new Battercake();
		System.out.println(battercake.getDesc() + "销售价格" + battercake.cost());
		
		Battercake battercakeWithEgg = new BattercakeWithEgg();
		System.out.println(battercakeWithEgg.getDesc() + "销售价格" + battercakeWithEgg.cost());
		
		Battercake battercakeWithEggSansage = new BattercakeWithEggSansage();
		System.out.println(battercakeWithEggSansage.getDesc() + "销售价格" + battercakeWithEggSansage.cost());
	}
}
