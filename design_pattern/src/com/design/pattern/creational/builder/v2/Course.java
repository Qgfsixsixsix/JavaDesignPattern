package com.design.pattern.creational.builder.v2;

/**
 * v2版本在实体类写的也是比较多的
 * 它把具体的实体类和具体实体类的builder写在一个类里 ，维护比较方便
 * @author Qgfzzzzzz
 * @date 2018-12-10
 * @version 1.0.0
 * The package is com.design.pattern.creational.builder.v2
 */
public class Course {
	private String courseName;
	private String coursePPT;
	private String courseVideo;
	private String courseArticle;
	
	//question & answer
	private String courseQA;
	
	public Course(CourseBuilder courseBuilder){
		this.courseName = courseBuilder.courseName;
		this.coursePPT = courseBuilder.coursePPT;
		this.courseVideo = courseBuilder.courseVideo;
		this.courseArticle = courseBuilder.courseArticle;
		this.courseQA = courseBuilder.courseQA;
		
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", coursePPT=" + coursePPT
				+ ", courseVideo=" + courseVideo + ", courseArticle="
				+ courseArticle + ", courseQA=" + courseQA + "]";
	}
	
	//把具体的实体类和实体类对应的Builder创建在一个类当中
	public static class CourseBuilder{
		private String courseName;
		private String coursePPT;
		private String courseVideo;
		private String courseArticle;
		
		//question & answer
		private String courseQA;
		
		//链式调用
		public CourseBuilder builderCourseName(String courseName){
			this.courseName = courseName;
			return this;
		}
		public CourseBuilder builderCoursePPT(String coursePPT) {
			this.coursePPT = coursePPT;
			return this;
		}

		public CourseBuilder builderCourseVideo(String courseVideo) {
			this.courseVideo = courseVideo;
			return this;
		}

		public CourseBuilder builderCourseArticle(String courseArticle) {
			this.courseArticle = courseArticle;
			return this;
		}

		public CourseBuilder builderCourseQA(String courseQA) {
			this.courseQA = courseQA;
			return this;
		}
		public Course build(){
			return new Course(this);
		}
	}
}
