package com.design.pattern.creational.singleton;

/**
 * ö�����͵ĵ���ģʽ���л����ƺͷ��乥��
 * ö�����͵ĵ���ģʽ������ʵ�ֵ���ģʽ�е����ʵ��
 * 
 * ö�����ʹ�������ģʽ�൱�ڶ���ʽһ������������ʱ�ʹ����ö�����
 * �������÷�����jad���߽��вο�Դ����
 * @author Qgfzzzzzz
 * @date 2018-12-6
 * @version 1.0.0
 * The package is com.design.pattern.creational.singleton
 */
public enum EnumInstance {

	INSTANCE{
		protected void printTest(){
			System.out.println("Qgf");
		}
	};
	protected abstract void printTest();//ͨ������������ܵ��������printTest
	private Object data;

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	public static EnumInstance getInstance(){
		return INSTANCE;
	}
}
