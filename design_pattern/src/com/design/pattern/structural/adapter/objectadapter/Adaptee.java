package com.design.pattern.structural.adapter.objectadapter;

/**
 * 从类适配器到对象适配器，被适配者和Target以及Target的实现类都是没有变化
 * 变化处在Adapter这里
 * @author Qgfzzzzzz
 * @date 2018-12-9
 * @version 1.0.0
 * The package is com.design.pattern.structural.adapter.classadapter
 */
public class Adaptee {

	public void adapteeRequest(){
		System.out.println("被适配者的方法");
	}
}
