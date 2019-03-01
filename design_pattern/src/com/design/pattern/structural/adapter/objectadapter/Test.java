package com.design.pattern.structural.adapter.objectadapter;

/**
 * ÀàµÄÊÊÅäÆ÷
 * @author Qgfzzzzzz
 * @date 2018-12-9
 * @version 1.0.0
 * The package is com.design.pattern.structural.adapter.classadapter
 */
public class Test {
	public static void main(String[] args) {
		Target target = new ConcreteTarget();
		target.request();
		
		Target adapterTarget = new Adapter();
		adapterTarget.request();
	}
}
