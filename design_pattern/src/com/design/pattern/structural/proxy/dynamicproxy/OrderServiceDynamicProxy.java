package com.design.pattern.structural.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.design.pattern.structural.proxy.Order;
import com.design.pattern.structural.proxy.db.DataSourceContextHolder;

public class OrderServiceDynamicProxy implements InvocationHandler {

	private Object target;
	
	public OrderServiceDynamicProxy(Object target) {
		this.target = target;
	}
	
	@SuppressWarnings("rawtypes")
	public Object bind(){
		Class cls = target.getClass();
		return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), this);
	}

	/**
	 * proxy �൱��һ������(������)
	 * method Ҫ����ǿ�ķ�������
	 * args method�ľ������
	 */
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object argObject = args[0];
		beforeMethod(argObject);
		//���ֵ����Ҫ����ǿ�����ķ���ֵ
		Object object = method.invoke(target, args);
		afterMethod();
		return object;
	}
	
	
	private void beforeMethod(Object obj){
		int userId = 0;
		System.out.println("��̬����		before core");
		if(obj instanceof Order){
			Order order = (Order)obj;
			userId = order.getUserId();
		}
		int dbRouter = userId % 2;
		System.out.println("��̬������䵽��db" + dbRouter + "����������");
		
		//todo ����dataSource;
		DataSourceContextHolder.setDBType(String.valueOf(dbRouter));
	}
	
	private void afterMethod(){
		System.out.println("��̬����		after core");
	}
}
