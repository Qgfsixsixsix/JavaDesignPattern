package com.design.pattern.structural.decorator.v2;

public class EggDecorator extends AbstractDescorator {

	public EggDecorator(ABattercake aBattercake) {
		super(aBattercake);
	}

	@Override
	protected String getDesc() {
		return super.getDesc() + "加一个鸡蛋";
	}

	@Override
	protected int cost() {
		return super.cost() + 1;
	}

	//比如要在加鸡的过程中加什么东西
	@Override
	public void doSomething() {
		
	}
	
}

