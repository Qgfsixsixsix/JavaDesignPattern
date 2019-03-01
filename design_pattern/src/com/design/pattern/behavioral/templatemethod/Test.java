package com.design.pattern.behavioral.templatemethod;

/**
 * 
 * @author Qgfzzzzzz
 * @date 2018-12-16
 * @version 1.0.0
 * The package is com.design.pattern.behavioral.templatemethod
 */
public class Test {
	public static void main(String[] args) {
		System.out.println("后端设计模式课程start---");
		ACourse designPatternCorse = new DesignPatternCourse();
		designPatternCorse.makeCourse();
		System.out.println("后端设计模式课程end---");
		
		System.out.println("前端课程start---");
		ACourse feCourse = new FECourse(false);
		
		feCourse.makeCourse();
		System.out.println("前端课程end---");
	}
}	
