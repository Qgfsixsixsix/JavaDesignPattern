package com.design.pattern.structural.decorator.v2;

public class SansageDecorator extends AbstractDescorator {

	public  SansageDecorator(ABattercake aBattercake) {
		super(aBattercake);
	}

	@Override
	protected String getDesc() {
		return super.getDesc() + "¼ÓÒ»¸ùÏã³¦";
	}

	@Override
	protected int cost() {
		return super.cost() + 2;
	}

	@Override
	public void doSomething() {
		
	}
	
}
