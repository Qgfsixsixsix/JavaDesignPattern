package com.design.pattern.behavioral.observer.ibeifeng.news;

import java.util.Observable;

/**
 * 被观察者
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
		System.out.println("更新文章，文章标题是：" + articleTitle + " 文章内容是：" + articleContent);
		this.setChanged();
		this.notifyObservers(art);//后面的s是通知所有的观察者
	}

}
