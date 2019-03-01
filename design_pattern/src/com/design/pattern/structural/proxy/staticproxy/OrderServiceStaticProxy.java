package com.design.pattern.structural.proxy.staticproxy;

import com.design.pattern.structural.proxy.IOrderService;
import com.design.pattern.structural.proxy.Order;
import com.design.pattern.structural.proxy.OrderServiceImpl;
import com.design.pattern.structural.proxy.db.DataSourceContextHolder;

/**
 * 
 * @author Qgfzzzzzz
 * @date 2018-12-6
 * @version 1.0.0
 * The package is com.design.pattern.structural.proxy
 */
public class OrderServiceStaticProxy {

	private IOrderService iOrderService;
	
	//�������Ŀ����Ϊ����ǿiOrderService��saveOrder()
	public int saveOrder(Order order){
		beforeMethod(order);
		iOrderService = new OrderServiceImpl();
		int result = iOrderService.saveOrder(order);
		afterMethod();
		return result;
	}
	private void beforeMethod(Order order){
		int userId = order.getUserId();
		int dbRouter = userId % 2;
		System.out.println("��̬������䵽��db" + dbRouter + "����������");
		
		//todo ����dataSource;
		DataSourceContextHolder.setDBType(String.valueOf(dbRouter));
		System.out.println("��̬����		before core");
	}
	private void afterMethod(){
		System.out.println("��̬����            after core");
	}
}
