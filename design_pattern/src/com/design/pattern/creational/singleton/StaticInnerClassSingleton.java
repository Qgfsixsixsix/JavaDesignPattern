package com.design.pattern.creational.singleton;

/**
 * 
 * @author Qgfzzzzzz
 * @date 2018-12-5
 * @version 1.0.0
 * The package is com.design.pattern.creational.singleton
 */
public class StaticInnerClassSingleton {

	//InnerClass������
	private static class InnerClass{
		private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
	}
	public static StaticInnerClassSingleton getInstance(){
		return InnerClass.staticInnerClassSingleton;
	}
	private StaticInnerClassSingleton(){
		
		//�����ʽ��һ��
		if(InnerClass.staticInnerClassSingleton != null){
			throw new RuntimeException("���������ֹ���ŵ���");
		}
	}
}
