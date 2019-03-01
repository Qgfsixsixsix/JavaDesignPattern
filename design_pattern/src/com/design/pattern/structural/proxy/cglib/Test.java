package com.design.pattern.structural.proxy.cglib;

/**
 * 
 * @author Qgfzzzzzz
 * @date 2018-12-7
 * @version 1.0.0
 * The package is com.design.pattern.structural.proxy.cglib
 */
public class Test {

	/**
	 * @param args void
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		
		
		CglibProxy proxy = new CglibProxy();
		Train t = (Train)proxy.getProxy(Train.class);
		t.move();
	}

}
