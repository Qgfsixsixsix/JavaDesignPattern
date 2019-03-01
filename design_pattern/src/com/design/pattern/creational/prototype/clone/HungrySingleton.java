package com.design.pattern.creational.prototype.clone;

import java.io.Serializable;

/*
 * ����ʽ������ʽ�����������
 * �ӳټ��أ���������ص�ʱ���ʼ�����ǵ���֮���ٳ�ʼ��
 */
/*
 * ��Դ�˷��ٵĻ�Ҳ���Կ��������ʽ
 */
/**
 * ����ʽ����ģʽ
 * �ŵ㣺����ص�ʱ�������˶����ʼ�����������߳�ͬ�������⣬
 * ȱ�㣺û���ӳټ��ص�Ч������������û���ù���������ڴ���˷�
 * @author Qgfzzzzzz
 * @date 2018-12-5
 * @version 1.0.0
 * The package is com.design.pattern.creational.singleton
 */
public class HungrySingleton implements Serializable, Cloneable {
	
	private static final long serialVersionUID = -2675816913092692975L;
	
	//private final static HungrySingleton hungrySingleton = new HungrySingleton();
	
	//����Ϊfinal�ı�����˼������������ʱ����ɸ�ֵ
	private final static HungrySingleton hungrySingleton;
	//Ҳ������static��̬�����new����
	//����ص�ʱ��Ҳ��ִ�о�̬�����
	static{
		hungrySingleton = new HungrySingleton();
	}
	private HungrySingleton(){
		//��ֹͨ�����䴴������Υ������ģʽ��ԭ��
		if(hungrySingleton != null){
			throw new RuntimeException("������������ֹ���䣡");
		}
		
	}
	public static HungrySingleton getInstance(){
		return hungrySingleton;	
	}
	
	private Object readResolve(){
		return hungrySingleton;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//return super.clone();
		
		//���ԭ��ģʽ�ƻ�����ģʽ�ķ���
		/**
		 * 1.��HungrySingleton��ȥʵ��Cloneable����ӿ�
		 * 2.�������ֱ�ӷ���getInstance()
		 * 	 return getInstance();
		 */
		return getInstance();
	}
	
}
