package com.design.pattern.creational.singleton;

/**
 * 
 * Thread不能保证全场唯一，但能保证线程唯一
 * 同步锁以时间换空间,ThreadLocal以空间换时间（它会创建很多对象）
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
