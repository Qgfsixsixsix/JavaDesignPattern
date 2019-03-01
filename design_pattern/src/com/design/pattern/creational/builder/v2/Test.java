package com.design.pattern.creational.builder.v2;

public class Test {

	/**
	 * @param args void
	 */
	public static void main(String[] args) {
		
		Course course = new Course.CourseBuilder().builderCourseName("Java���ģʽ����").
												   builderCoursePPT("Java���ģʽ����PPT").
												   builderCourseVideo("Java���ģʽ������Ƶ").build();
		System.out.println(course);
	}

}
