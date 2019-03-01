package com.design.pattern.structural.proxy.dynamicproxy;

import com.design.pattern.structural.proxy.IOrderService;
import com.design.pattern.structural.proxy.Order;
import com.design.pattern.structural.proxy.OrderServiceImpl;

public class Test {

	/**
	 * @param args void
	 */
	public static void main(String[] args) {

		Order order = new Order();
		order.setUserId(2);
		
		IOrderService orderServiceDynamicProxy = (IOrderService)new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
		orderServiceDynamicProxy.saveOrder(order);
	}

}
