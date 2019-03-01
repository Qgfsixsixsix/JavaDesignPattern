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
		System.out.println("������ģʽ�γ�start---");
		ACourse designPatternCorse = new DesignPatternCourse();
		designPatternCorse.makeCourse();
		System.out.println("������ģʽ�γ�end---");
		
		System.out.println("ǰ�˿γ�start---");
		ACourse feCourse = new FECourse(false);
		
		feCourse.makeCourse();
		System.out.println("ǰ�˿γ�end---");
	}
}	
