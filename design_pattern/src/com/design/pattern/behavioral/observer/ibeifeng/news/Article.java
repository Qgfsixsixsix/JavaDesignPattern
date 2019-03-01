package com.design.pattern.behavioral.observer.ibeifeng.news;

public class Article {

	private String articleTitle;
	private String articleContent;
	public String getArticleTitle() {
		return articleTitle;
	}
	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}
	public String getArticleContent() {
		return articleContent;
	}
	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}
	@Override
	public String toString() {
		return "Article [articleTitle=" + articleTitle + ", articleContent="
				+ articleContent + "]";
	}
	
}