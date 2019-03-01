package com.design.pattern.structural.decorator.v2;

//抽象的装饰类就是看你业务的情况，也可以不用抽象abstract
public abstract class AbstractDescorator extends ABattercake {

	private ABattercake aBattercake;
	
	public AbstractDescorator(ABattercake aBattercake){
		this.aBattercake = aBattercake;
	}
	
	//比如要在加某种东西的时候是否要加什么动作
	public abstract void doSomething();
	
	@Override
	protected String getDesc() {
		return this.aBattercake.getDesc();
	}

	@Override
	protected int cost() {
		return this.aBattercake.cost();
	}

}
