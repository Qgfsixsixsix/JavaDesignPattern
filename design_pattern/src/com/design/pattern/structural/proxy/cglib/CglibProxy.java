package com.design.pattern.structural.proxy.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;



public class CglibProxy implements MethodInterceptor {

	//���������������
	private Enhancer enhancer = new Enhancer();
	
	//���ݵĲ���������Ҫ���ĸ�����д���
	@SuppressWarnings("rawtypes")
	public Object getProxy(Class clazz){
	
		//���ô����������
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		
		return enhancer.create();
	}
	/**
	 * ��������Ŀ����ĵ���
	 * 
	 * obj Ŀ�����ʵ��
	 * m  Ŀ�귽���ķ������
	 * args �����Ĳ���
	 * proxy �������ʵ��
	 * 
	 */
	public Object intercept(Object obj, Method m, Object[] args,
			MethodProxy proxy) throws Throwable {
		
		System.out.println("��־����...............");
		
		//��������ñ����������ķ���
		proxy.invokeSuper(obj, args);
		
		System.out.println("��־����................");
		
		return null;
	}

	
}
