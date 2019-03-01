package com.design.pattern.structural.decorator.v1;

public class BattercakeWithEgg extends Battercake {

	@Override
	public String getDesc() {
		return super.getDesc() + "¼ÓÒ»¸ö¼¦µ°";
	}

	@Override
	public int cost() {
		return super.cost() + 1;
	}

}
