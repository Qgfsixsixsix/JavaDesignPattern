package com.design.pattern.behavioral.observer;

import java.util.Observable;

public class Persion extends Observable {
	
	//Persion'property
	private String name;
	private String sex;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		this.setChanged();
		
		System.out.println(hasChanged());
		
		//inform the observers
		this.notifyObservers();
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
		this.setChanged();
		//inform the observers
		this.notifyObservers();
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		this.setChanged();
		//inform the observers
		this.notifyObservers();
	}
	@Override
	public String toString() {
		return "Persion [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
	

}
