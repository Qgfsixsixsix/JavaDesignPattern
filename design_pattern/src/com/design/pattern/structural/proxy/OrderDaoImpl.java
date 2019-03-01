package com.design.pattern.structural.proxy;

public class OrderDaoImpl implements IOrderDao {

	public int insert(Order order) {
		System.out.println("Dao²ãÌí¼Óorder³É¹¦");
		return 1;
	}

}
