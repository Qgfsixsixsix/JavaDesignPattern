package com.design.pattern.structural.adapter.life;

/**
 * 它是被适配者(adaptee)
 * @author Qgfzzzzzz
 * @date 2018-12-9
 * @version 1.0.0
 * The package is com.design.pattern.structural.adapter.life
 */
public class AC220 {

	public int outputAC220V(){
		int output = 220;
		System.out.println("输出交流电" + output + "V");
		return output;
	}
}
