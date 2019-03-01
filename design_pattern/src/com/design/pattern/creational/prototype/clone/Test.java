package com.design.pattern.creational.prototype.clone;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

/**
 * 这里是浅克隆，只克隆Pig这个层次
 * @author Qgfzzzzzz
 * @date 2018-12-15
 * @version 1.0.0
 * The package is com.design.pattern.creational.prototype.clone
 */
public class Test {
	/**
	 * @param args
	 * @throws CloneNotSupportedException
	 * @throws SecurityException
	 * @throws NoSuchMethodException void
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
	
		Date birthday = new Date(0L);
		Pig pig1 = new Pig("佩奇", birthday);
		Pig pig2 = (Pig)pig1.clone();
		System.out.println(pig1);
		System.out.println(pig2);
		
		//浅克隆只克隆Pig这个对象，但是Date这个对象并没有受到影响
		pig1.getBirthday().setTime(666666666666666L);
		System.out.println(pig1);
		System.out.println(pig2);
		
		/*//通过原型模式破坏单例模式
		HungrySingleton hungrySingleton = HungrySingleton.getInstance();
		Method method = hungrySingleton.getClass().getDeclaredMethod("clone");
		method.setAccessible(true);
		HungrySingleton cloneHungrySingleton = (HungrySingleton)method.invoke(hungrySingleton);
		System.out.println(hungrySingleton);
		System.out.println(cloneHungrySingleton);
		
		//怎么解决原型模式破坏单例模式呢？
*/	}
}
