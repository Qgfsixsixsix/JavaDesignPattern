package com.design.pattern.behavioral.templatemethod;

/**
 * 
 * @author Qgfzzzzzz
 * @date 2018-12-16
 * @version 1.0.0
 * The package is com.design.pattern.behavioral.templatemethod
 */
public abstract class ACourse {

	protected final void makeCourse(){
		this.makePPT();
		this.makeVideo();
		//���ӷ���
		if(needWriteArticle()){
			this.writeArticle();
		}
		this.packageCourse();
	}
	
	final void makePPT(){
		System.out.println("����PPT");
	}
	
	final void makeVideo(){
		System.out.println("������Ƶ");
	}
	
	
	final void writeArticle(){
		System.out.println("��д�ּ�");
	}
	
	//���ӷ���
	protected boolean needWriteArticle(){
		return false;
	}
	
	abstract void packageCourse();
}
