package com.design.pattern.structural.decorator.v2;

//�����װ������ǿ���ҵ��������Ҳ���Բ��ó���abstract
public abstract class AbstractDescorator extends ABattercake {

	private ABattercake aBattercake;
	
	public AbstractDescorator(ABattercake aBattercake){
		this.aBattercake = aBattercake;
	}
	
	//����Ҫ�ڼ�ĳ�ֶ�����ʱ���Ƿ�Ҫ��ʲô����
	public abstract void doSomething();
	
	@Override
	protected String getDesc() {
		return this.aBattercake.getDesc();
	}

	@Override
	protected int cost() {
		return this.aBattercake.cost();
	}

}
