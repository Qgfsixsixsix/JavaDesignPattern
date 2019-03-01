package com.design.pattern.behavioral.observer.ibeifeng.news;

import java.util.Observable;
import java.util.Observer;

public class MyObsrever implements Observer {

	public void update(Observable o, Object arg) {
		Article art = (Article)arg;
		System.out.println("博主发表了新的文章，快去看吧！");
		System.out.println("博主文章的标题是：" + art.getArticleTitle());
		System.out.println("博主文章的内容是：" + art.getArticleTitle());
	}

}
