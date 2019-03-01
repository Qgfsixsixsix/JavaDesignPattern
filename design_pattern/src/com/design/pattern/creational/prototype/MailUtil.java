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
		//ע�������{0}{1}{2}����Щ��ռλ��
		String outputContent = "��{0}ͬѧ���ʼ���ַ��{1},�ʼ����ݣ�{2}�����ʼ��ɹ���";
		System.out.println(MessageFormat.format(outputContent, mail.getName(),mail.getEmailAddress(), mail.getContent()));
		
	}
	
	public static void saveOriginMailRecord(Mail mail){
		System.out.println("�洢originMail��¼��originMail:" + mail.getContent());
	}
}
