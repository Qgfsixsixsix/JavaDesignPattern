package com.design.pattern.structural.proxy;

public class OrderDaoImpl implements IOrderDao {

	public int insert(Order order) {
		System.out.println("Dao�����order�ɹ�");
		return 1;
	}

}
