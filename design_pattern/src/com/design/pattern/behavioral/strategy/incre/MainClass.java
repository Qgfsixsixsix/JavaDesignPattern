package com.design.pattern.behavioral.strategy.incre;

public class MainClass {

	/**
	 * @param args void
	 */
	public static void main(String[] args) {
		
		double num = 200;
		
		Context context = new Context(new StrategyB());
		double newNum = context.cost(num);
		System.out.println("Êµ¼Ê¸¶ÕË" + newNum + "Ôª");
	}

}
