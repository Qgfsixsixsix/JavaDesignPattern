package com.design.pattern.behavioral.templatemethod;

public class FECourse extends ACourse {

	private boolean needWriteArticleFlag = false;
	
	public FECourse(boolean needWriteArticleFlag) {
		this.needWriteArticleFlag = needWriteArticleFlag;
	}

	@Override
	void packageCourse() {
		System.out.println("�ṩ�γ̵�ǰ�˴���");
		System.out.println("�ṩ�γ̵�ͼƬ�ȶ�ý���ز�");
	}

	@Override
	protected boolean needWriteArticle() {
		return this.needWriteArticleFlag;
	}

	
}
	