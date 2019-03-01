package com.design.pattern.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * 
 * @author Qgfzzzzzz
 * @date 2018-12-4
 * @version 1.0.0
 * The package is com.design.pattern.creational.singleton
 */

public class LazySingleton {
	
	private static LazySingleton lazySingleton = null;
	
	//---------------------private static boolean flag = true;
	private LazySingleton(){

		/*if(flag){
			flag = true;
		}else{
			throw new RuntimeException("单例构造器禁止反射调用！");
		}*/
		
		if(lazySingleton != null){
			throw new RuntimeException("单例构造器禁止反射调用！");
		}
	}
	
	public synchronized static LazySingleton getInstance(){
		//------------synchronized (LazySingleton.class) {}
		if(lazySingleton == null){
			lazySingleton = new LazySingleton();
		}
		return lazySingleton;
	}
	
	/*@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String [] args) throws Exception {
		Class objectClass = LazySingleton.class;
		Constructor c = objectClass.getDeclaredConstructor();
		c.setAccessible(true);
		LazySingleton o1 = LazySingleton.getInstance();
		
		//破坏这个flag
		Field flag = o1.getClass().getDeclaredField("flag");
		flag.setAccessible(true);
		flag.set(o1, true);
		LazySingleton o2 = (LazySingleton)c.newInstance();
	    
		
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o1 == o2);
	}*/
	
}

