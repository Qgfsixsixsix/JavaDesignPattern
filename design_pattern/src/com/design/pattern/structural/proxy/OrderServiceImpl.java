package com.design.pattern.structural.proxy;

public class OrderServiceImpl implements IOrderService {

	private IOrderDao iOrderDao;
	public int saveOrder(Order order) {
		//Spring���Լ�ע�룬���ǿγ��о�ֱ��new��
		iOrderDao = new OrderDaoImpl();
		System.out.println("Service�����Dao�����order���� ");
		return iOrderDao.insert(order);
	}

}
