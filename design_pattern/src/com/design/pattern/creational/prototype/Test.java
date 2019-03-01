package com.design.pattern.creational.prototype;

/**
 * ԭ��ģʽ�����ڴ��н��ж��������Ŀ���
 * �����ڴ���ֱ��newһ���������ܺúܶ�
 * 
 * ʵ�ʿ����Ĺ��������ģʽ�ȳ���úܶ࣬
 * ֱ����Ŀ����ʵ��һ���ӿ�
 * @author Qgfzzzzzz
 * @date 2018-12-15
 * @version 1.0.0
 * The package is com.design.pattern.creational.prototype
 */
public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		Mail mail = new Mail();
		mail.setContent("��ʼ��ģ��");
		System.out.println("��ʼ����ģ��" + mail);
		for(int i = 0; i < 10; i++){
			/*
			 * �����¡�ķ���clone()��û�е���Mail�Ĺ�����
			 */
			Mail mailTemp = (Mail)mail.clone();
			//false˵����clone()�����Ĳ���ͬһ������
			System.out.println(mail == mailTemp);
			mailTemp.setName("����" + i);
			mailTemp.setEmailAddress("����" + i + "@imooc.com");
			mailTemp.setContent("��ϲ�㣬�˴�Ľ������н��ˣ�");
			MailUtil.sendMail(mailTemp);
			System.out.println("��¡��ģ�壺" + mailTemp);
		}
		MailUtil.saveOriginMailRecord(mail);
	}
}
