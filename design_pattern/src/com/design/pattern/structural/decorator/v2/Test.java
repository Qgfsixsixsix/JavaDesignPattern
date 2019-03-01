package com.design.pattern.structural.decorator.v2;

/**
 * 
 * @author Qgfzzzzzz
 * @date 2018-12-9
 * @version 1.0.0
 * The package is com.design.pattern.structural.decorator.v2
 */
public class Test {
	public static void main(String[] args) {
		ABattercake aBattercake;
		aBattercake = new Battercake();
		aBattercake = new EggDecorator(aBattercake);
		aBattercake = new EggDecorator(aBattercake);
		aBattercake = new SansageDecorator(aBattercake);
		System.out.println(aBattercake.getDesc() + "销售价格：" + aBattercake.cost());
	}
}
