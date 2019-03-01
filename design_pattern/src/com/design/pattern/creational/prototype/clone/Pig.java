package com.design.pattern.creational.prototype.clone;

import java.util.Date;

/**
 * 
 * @author Qgfzzzzzz
 * @date 2018-12-15
 * @version 1.0.0
 * The package is com.design.pattern.creational.prototype.clone
 */
public class Pig implements Cloneable {
	
	private String name;
	private Date birthday;
	
	public Pig(String name, Date birthday) {
		this.name = name;
		this.birthday = birthday;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	//��Ҫ���¡��Ҫ��дclone()����
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//���¡������Ϊ����д��¡����
		Pig pig = (Pig)super.clone();
		pig.birthday = (Date)pig.birthday.clone();
		return pig;
	}
	@Override
	public String toString() {
		return "Pig [name=" + name + ", birthday=" + birthday + "]" + super.toString();
	}
	
}
