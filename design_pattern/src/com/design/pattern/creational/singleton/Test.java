package com.design.pattern.creational.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Test {

	/**
	 * @param args void
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	//@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws Exception {
		//LazySingleton lazySingleton = LazySingleton.getInstance();
		/*
		Thread t1 = new Thread(new T());
		Thread t2 = new Thread(new T());
		t1.start();
		t2.start();
		System.out.println("program end");
		*/
		/*
		 * 序列化
		 */
		/*HungrySingleton instance = HungrySingleton.getInstance();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
		oos.writeObject(instance);
		
		File file = new File("singleton_file");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		HungrySingleton newinstance = (HungrySingleton) ois.readObject();
		 
		System.out.println(instance);
		System.out.println(newinstance);
		System.out.println(instance == newinstance);*/
		
		/*
		 * 这个从饿汉那里取
		 */
		/*@SuppressWarnings("rawtypes")
		Class classObject = HungrySingleton.class;
		
		@SuppressWarnings({ "rawtypes", "unchecked" })
		Constructor constructor = classObject.getDeclaredConstructor();
		constructor.setAccessible(true);
		HungrySingleton instance = HungrySingleton.getInstance();
		HungrySingleton newinstance = (HungrySingleton) constructor.newInstance();
		System.out.println(instance);
		System.out.println(newinstance);
		System.out.println(instance == newinstance);*/
		
		/*
		 * 静态内部类（也是通过类加载完成时创建对象的）
		 */
		@SuppressWarnings("rawtypes")
		Class classObject = StaticInnerClassSingleton.class;
		
		@SuppressWarnings({ "rawtypes", "unchecked" })
		Constructor constructor = classObject.getDeclaredConstructor();
		constructor.setAccessible(true);
		StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
		StaticInnerClassSingleton newinstance = (StaticInnerClassSingleton) constructor.newInstance();
		System.out.println(instance);
		System.out.println(newinstance);
		System.out.println(instance == newinstance);
		
		/*
		 * 懒汉式
		 */
		/*@SuppressWarnings("rawtypes")
		Class classObject = LazySingleton.class;
		
		@SuppressWarnings({ "rawtypes", "unchecked" })
		Constructor constructor = classObject.getDeclaredConstructor();
		constructor.setAccessible(true);
		LazySingleton newinstance = (LazySingleton) constructor.newInstance();
		LazySingleton instance = LazySingleton.getInstance(); 
		
		System.out.println(instance);
		System.out.println(newinstance);
		System.out.println(instance == newinstance);*/
		
		/*
		 * 枚举类型的序列化机制
		 */
		/*EnumInstance instance = EnumInstance.getInstance();
		instance.setData(new Object());
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
		oos.writeObject(instance);
		
		File file = new File("singleton_file");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		EnumInstance newInstance = (EnumInstance) ois.readObject(); 
		
		System.out.println(instance.getData());
		System.out.println(newInstance.getData());
		System.out.println(instance.getData() == newInstance.getData());*/
	
		/*
		 * 通过枚举类型反射是否能获得单例模式的对象
		 * error ： Cannot reflectively create enum objects
		 */
		/*Class objectClass = EnumInstance.class;
		Constructor constructor = objectClass.getDeclaredConstructor(String.class, int.class);
		constructor.setAccessible(true);
		
		EnumInstance instance = (EnumInstance)constructor.newInstance("qgf", 666);*/
		
		/*
		 * 通过这个jad来查看EnumInstance类的printTest顺序
		 * 
		 */
		/*EnumInstance instance = EnumInstance.getInstance();
		instance.printTest();*/
		
		
		
		
		
		/*
		 * 多线程操作ContainerSingleton
		 * 
		 */
		//main本身就是一个线程
		/*System.out.println("main thread" + ThreadLocalInstance.getInstance());
		System.out.println("main thread" + ThreadLocalInstance.getInstance());
		System.out.println("main thread" + ThreadLocalInstance.getInstance());
		System.out.println("main thread" + ThreadLocalInstance.getInstance());
		System.out.println("main thread" + ThreadLocalInstance.getInstance());
		System.out.println("main thread" + ThreadLocalInstance.getInstance());
		Thread t1 = new Thread(new T());
		Thread t2 = new Thread(new T());
		t1.start();
		t2.start();
		System.out.println("program end");*/
	}
}
