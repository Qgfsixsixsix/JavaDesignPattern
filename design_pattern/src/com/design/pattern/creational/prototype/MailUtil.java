package com.design.pattern.creational.prototype;

import java.text.MessageFormat;

/**
 * 
 * @author Qgfzzzzzz
 * @date 2018-12-15
 * @version 1.0.0
 * The package is com.design.pattern.creational.prototype
 */
public class MailUtil {

	public static void sendMail(Mail mail){
		//注意这里的{0}{1}{2}，这些是占位符
		String outputContent = "向{0}同学，邮件地址：{1},邮件内容：{2}发送邮件成功！";
		System.out.println(MessageFormat.format(outputContent, mail.getName(),mail.getEmailAddress(), mail.getContent()));
		
	}
	
	public static void saveOriginMailRecord(Mail mail){
		System.out.println("存储originMail记录，originMail:" + mail.getContent());
	}
}
