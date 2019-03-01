package com.design.pattern.creational.singleton;

import java.io.Serializable;

/*
 * 饿汉式和懒汉式的最大区别是
 * 延迟加载，是在类加载的时候初始化还是调用之后再初始化
 */
/*
 * 资源浪费少的话也可以考虑这个方式
 */
/**
 * 饿汉式单例模式
 * 优点：类加载的时候就完成了对象初始化，避免了线程同步的问题，
 * 缺点：没有延迟加载的效果，如果这个类没有用过还会造成内存的浪费
 * @author Qgfzzzzzz
 * @date 2018-12-5
 * @version 1.0.0
 * The package is com.design.pattern.creational.singleton
 */
public class HungrySingleton implements Serializable {
	
	private static final long serialVersionUID = -2675816913092692975L;
	
	//private final static HungrySingleton hungrySingleton = new HungrySingleton();
	
	//声明为final的变量意思是在类加载完成时就完成赋值
	private final static HungrySingleton hungrySingleton;
	//也可以用static静态代码块new对象
	//类加载的时候也会执行静态代码块
	static{
		hungrySingleton = new HungrySingleton();
	}
	private HungrySingleton(){
		//防止通过反射创建对象，违背单例模式的原则
		if(hungrySingleton != null){
			throw new RuntimeException("单例构造器禁止反射！");
		}
		
	}
	public static HungrySingleton getInstance(){
		return hungrySingleton;	
	}
	
	private Object readResolve(){
		return hungrySingleton;
	}
}
