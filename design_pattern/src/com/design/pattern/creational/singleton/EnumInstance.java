package com.design.pattern.creational.singleton;

/**
 * 枚举类型的单例模式序列化机制和反射攻击
 * 枚举类型的单例模式可能是实现单例模式中的最佳实践
 * 
 * 枚举类型创建单例模式相当于饿汉式一样在类加载完成时就创建好对象了
 * 可以利用反编译jad工具进行参看源代码
 * @author Qgfzzzzzz
 * @date 2018-12-6
 * @version 1.0.0
 * The package is com.design.pattern.creational.singleton
 */
public enum EnumInstance {

	INSTANCE{
		protected void printTest(){
			System.out.println("Qgf");
		}
	};
	protected abstract void printTest();//通过这个声明才能调用里面的printTest
	private Object data;

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	public static EnumInstance getInstance(){
		return INSTANCE;
	}
}
