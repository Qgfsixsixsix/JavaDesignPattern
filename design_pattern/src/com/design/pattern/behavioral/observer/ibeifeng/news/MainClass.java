package com.design.pattern.behavioral.observer.ibeifeng.news;

public class MainClass {
	public static void main(String[] args) {
		BlogUser user = new BlogUser();
		user.addObserver(new MyObsrever());
		user.publicBlog("哈哈，博主更新文章了", "快点去浏览吧！");
		
	}

}
