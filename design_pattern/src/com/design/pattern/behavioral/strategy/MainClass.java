package com.design.pattern.behavioral.strategy;

public class MainClass {

	/**
	 * @param args void
	 */
	public static void main(String[] args) {
		/*Strategy stra = new MD5Strategy();
		stra.encrypt();*/
		
		Context context = new Context(new MD5Strategy());
		context.encrypt();
	}

}
