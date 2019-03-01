package com.design.pattern.creational.prototype;

/**
 * 原型模式是在内存中进行二进制流的拷贝
 * 比在内存中直接new一个对象性能好很多
 * 
 * 实际开发的过程这个的模式比抽象好很多，
 * 直接在目标类实现一个接口
 * @author Qgfzzzzzz
 * @date 2018-12-15
 * @version 1.0.0
 * The package is com.design.pattern.creational.prototype
 */
public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		Mail mail = new Mail();
		mail.setContent("初始化模板");
		System.out.println("初始化的模板" + mail);
		for(int i = 0; i < 10; i++){
			/*
			 * 这个克隆的方法clone()并没有调用Mail的构造器
			 */
			Mail mailTemp = (Mail)mail.clone();
			//false说明了clone()出来的不是同一个对象
			System.out.println(mail == mailTemp);
			mailTemp.setName("姓名" + i);
			mailTemp.setEmailAddress("姓名" + i + "@imooc.com");
			mailTemp.setContent("恭喜你，此次慕课网活动中奖了！");
			MailUtil.sendMail(mailTemp);
			System.out.println("克隆的模板：" + mailTemp);
		}
		MailUtil.saveOriginMailRecord(mail);
	}
}
