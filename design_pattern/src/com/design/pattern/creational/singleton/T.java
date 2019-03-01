package com.design.pattern.creational.singleton;

/**
 * 
 * @author Qgfzzzzzz
 * @date 2018-12-4
 * @version 1.0.0
 * The package is com.design.pattern.creational.singleton
 */
public class T implements Runnable {

	public void run() {
		//LazySingleton instance = LazySingleton.getInstance();
		//LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
		
		StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
		
		//ContainerSingleton.putInstance("object", new Object());
		//Object instance = ContainerSingleton.getInstance("object");
		
		
		//ThreadLocalInstance instance = ThreadLocalInstance.getInstance();
		System.out.println(Thread.currentThread() + " " + instance);
	}

}
