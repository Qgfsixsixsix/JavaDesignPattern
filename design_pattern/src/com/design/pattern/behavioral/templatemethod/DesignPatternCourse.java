package com.design.pattern.behavioral.templatemethod;

public class DesignPatternCourse extends ACourse {

	@Override
	void packageCourse() {
		System.out.println("�ṩ�γ�JavaԴ����");
	}

	@Override
	protected boolean needWriteArticle() {
		return true;
	}
	
	

}
