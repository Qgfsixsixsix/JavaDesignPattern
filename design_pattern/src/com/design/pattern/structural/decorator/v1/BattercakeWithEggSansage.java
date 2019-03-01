package com.design.pattern.structural.decorator.v1;

public class BattercakeWithEggSansage extends Battercake{

	@Override
	protected String getDesc() {
		return super.getDesc() + "��һ���㳦";
	}

	@Override
	protected int cost() {
		return super.cost() + 2;
	}

}
