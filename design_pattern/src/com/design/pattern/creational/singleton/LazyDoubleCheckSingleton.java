package com.design.pattern.creational.singleton;

public class LazyDoubleCheckSingleton {

	//volatile禁止重排序
	private  static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;
	
	private LazyDoubleCheckSingleton(){
		
	}
	public static LazyDoubleCheckSingleton getInstance(){
		//synchronized (LazySingleton.class) {}
		if(lazyDoubleCheckSingleton == null){
			synchronized(LazyDoubleCheckSingleton.class){
				if(lazyDoubleCheckSingleton == null){
					//----下面2和3互换可以重排序
					//1.分配内存
					//3.设置lazyDoubleCheckSingleton指向刚分配的内存
					//2.初始化对象
					//intra-thread semantics(保证重排序不会改变单线程的结果，重排序可以提高性能)
					////////////////////////3.设置lazyDoubleCheckSingleton指向刚分配的内存地址
					
					//两种方法解决重排序
					//1.禁止重排序 2.可以重排序，但不然其他线程看到
					lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
				}
			}
 		}
		return lazyDoubleCheckSingleton;
	}
}
