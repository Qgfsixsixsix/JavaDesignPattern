package com.design.pattern.behavioral.observer.ibeifeng.news;

import java.util.Observable;

/**
 * ���۲���
 * @author Qgfzzzzzz
 * @date 2018-12-21
 * @version 1.0.0
 * The package is com.design.pattern.behavioral.observer.ibeifeng.news
 */
public class BlogUser extends Observable {
	
	public void publicBlog(String articleTitle, String articleContent){
		Article art = new Article();
		art.setArticleTitle(articleTitle);
		art.setArticleContent(articleContent);
		System.out.println("�������£����±����ǣ�" + articleTitle + " ���������ǣ�" + articleContent);
		this.setChanged();
		this.notifyObservers(art);//�����s��֪ͨ���еĹ۲���
	}

}
