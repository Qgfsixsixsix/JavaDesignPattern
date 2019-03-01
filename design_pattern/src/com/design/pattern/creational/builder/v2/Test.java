package com.design.pattern.creational.builder.v2;

public class Test {

	/**
	 * @param args void
	 */
	public static void main(String[] args) {
		
		Course course = new Course.CourseBuilder().builderCourseName("Java设计模式精讲").
												   builderCoursePPT("Java设计模式精讲PPT").
												   builderCourseVideo("Java设计模式精讲视频").build();
		System.out.println(course);
	}

}
