package com.design.pattern.structural.proxy.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;



public class CglibProxy implements MethodInterceptor {

	//创建代理类的属性
	private Enhancer enhancer = new Enhancer();
	
	//传递的参数就是需要对哪个类进行代理
	@SuppressWarnings("rawtypes")
	public Object getProxy(Class clazz){
	
		//设置创建子类的类
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		
		return enhancer.create();
	}
	/**
	 * 拦截所有目标类的调用
	 * 
	 * obj 目标类的实例
	 * m  目标方法的反射对象
	 * args 方法的参数
	 * proxy 代理类的实例
	 * 
	 */
	public Object intercept(Object obj, Method m, Object[] args,
			MethodProxy proxy) throws Throwable {
		
		System.out.println("日志处理...............");
		
		//代理类调用被代理类对象的方法
		proxy.invokeSuper(obj, args);
		
		System.out.println("日志结束................");
		
		return null;
	}

	
}
