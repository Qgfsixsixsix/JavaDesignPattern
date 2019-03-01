package com.design.pattern.structural.decorator.v2;

public class Battercake extends ABattercake {

	@Override
	protected String getDesc() {
		return "¼å±ý";
	}

	@Override
	protected int cost() {
		return 8;
	}

}
