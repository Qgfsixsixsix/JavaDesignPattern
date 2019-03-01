package com.design.pattern.creational.singleton;

public class LazyDoubleCheckSingleton {

	//volatile��ֹ������
	private  static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;
	
	private LazyDoubleCheckSingleton(){
		
	}
	public static LazyDoubleCheckSingleton getInstance(){
		//synchronized (LazySingleton.class) {}
		if(lazyDoubleCheckSingleton == null){
			synchronized(LazyDoubleCheckSingleton.class){
				if(lazyDoubleCheckSingleton == null){
					//----����2��3��������������
					//1.�����ڴ�
					//3.����lazyDoubleCheckSingletonָ��շ�����ڴ�
					//2.��ʼ������
					//intra-thread semantics(��֤�����򲻻�ı䵥�̵߳Ľ��������������������)
					////////////////////////3.����lazyDoubleCheckSingletonָ��շ�����ڴ��ַ
					
					//���ַ������������
					//1.��ֹ������ 2.���������򣬵���Ȼ�����߳̿���
					lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
				}
			}
 		}
		return lazyDoubleCheckSingleton;
	}
}
