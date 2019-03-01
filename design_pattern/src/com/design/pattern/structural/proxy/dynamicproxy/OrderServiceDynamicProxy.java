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
	 * proxy 相当于一个摆设(代理类)
	 * method 要被增强的方法对象
	 * args method的具体参数
	 */
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object argObject = args[0];
		beforeMethod(argObject);
		//这个值就是要被增强方法的返回值
		Object object = method.invoke(target, args);
		afterMethod();
		return object;
	}
	
	
	private void beforeMethod(Object obj){
		int userId = 0;
		System.out.println("动态代理		before core");
		if(obj instanceof Order){
			Order order = (Order)obj;
			userId = order.getUserId();
		}
		int dbRouter = userId % 2;
		System.out.println("动态代理分配到【db" + dbRouter + "】处理数据");
		
		//todo 设置dataSource;
		DataSourceContextHolder.setDBType(String.valueOf(dbRouter));
	}
	
	private void afterMethod(){
		System.out.println("动态代理		after core");
	}
}
