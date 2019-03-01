package com.design.pattern.behavioral.strategy.incre;

/**
 * 
 * @author Qgfzzzzzz
 * @date 2018-12-16
 * @version 1.0.0
 * The package is com.design.pattern.behavioral.strategy.incre
 */
public class Context {

	private Strategy strategy;
	public Context(Strategy strategy){
		this.strategy = strategy;
	}
	
	public double cost(double num){
		return this.strategy.cost(num);
	}
}
