package com.design.pattern.structural.proxy;

/**
 * 
 * @author Qgfzzzzzz
 * @date 2018-12-6
 * @version 1.0.0
 * The package is com.design.pattern.structural.proxy
 */
public class Order {

	private Object orderInfo;
	private Integer userId;
	public Object getOrderInfo() {
		return orderInfo;
	}
	public void setOrderInfo(Object orderInfo) {
		this.orderInfo = orderInfo;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
}
