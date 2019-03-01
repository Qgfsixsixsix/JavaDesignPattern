package com.design.pattern.structural.proxy.staticproxy;

import com.design.pattern.structural.proxy.Order;

public class Test {

	/**
	 * @param args void
	 */
	public static void main(String[] args) {

		Order order = new Order();
		order.setUserId(2);
		
		OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
		orderServiceStaticProxy.saveOrder(order);
	}

}
