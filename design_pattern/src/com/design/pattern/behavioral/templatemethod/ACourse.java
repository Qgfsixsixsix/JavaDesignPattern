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
		//钩子方法
		if(needWriteArticle()){
			this.writeArticle();
		}
		this.packageCourse();
	}
	
	final void makePPT(){
		System.out.println("制作PPT");
	}
	
	final void makeVideo(){
		System.out.println("制作视频");
	}
	
	
	final void writeArticle(){
		System.out.println("编写手记");
	}
	
	//钩子方法
	protected boolean needWriteArticle(){
		return false;
	}
	
	abstract void packageCourse();
}
