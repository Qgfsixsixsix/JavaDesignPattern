package com.design.pattern.behavioral.observer.ibeifeng.news;

import java.util.Observable;
import java.util.Observer;

public class MyObsrever implements Observer {

	public void update(Observable o, Object arg) {
		Article art = (Article)arg;
		System.out.println("�����������µ����£���ȥ���ɣ�");
		System.out.println("�������µı����ǣ�" + art.getArticleTitle());
		System.out.println("�������µ������ǣ�" + art.getArticleTitle());
	}

}
