package com.design.pattern.creational.builder;

/**
 * 
 * @author Qgfzzzzzz
 * @date 2018-12-10
 * @version 1.0.0
 * The package is com.design.pattern.creational.builder
 */
public class Test {
	public static void main(String[] args) {
		CourseBuilder courseBuilder = new CourseActualBuilder();
		Coach coach = new Coach();
		coach.setCourseBuilder(courseBuilder);
		
		Course course = coach.makeCourse("Java���ģʽ����", "Java���ģʽ����PPT", 
										"Java���ģʽ������Ƶ", "Java���ģʽ�����ּ�", "Java���ģʽ�����ʴ�");
		System.out.println(course);
	}
}
