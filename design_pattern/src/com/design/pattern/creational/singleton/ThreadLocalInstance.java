package com.design.pattern.creational.singleton;

/**
 * 
 * Thread���ܱ�֤ȫ��Ψһ�����ܱ�֤�߳�Ψһ
 * ͬ������ʱ�任�ռ�,ThreadLocal�Կռ任ʱ�䣨���ᴴ���ܶ����
 * 
 * @author Qgfzzzzzz
 * @date 2018-12-6
 * @version 1.0.0
 * The package is com.design.pattern.creational.singleton
 */
public class ThreadLocalInstance {

	public static final ThreadLocal<ThreadLocalInstance> threadLocalInstanceThreadLocal
			= new ThreadLocal<ThreadLocalInstance>(){

				@Override
				protected ThreadLocalInstance initialValue() {
					return new ThreadLocalInstance();
				}
	};
	private ThreadLocalInstance(){
		
	}
	public static ThreadLocalInstance getInstance(){
		return threadLocalInstanceThreadLocal.get();
	}
}
