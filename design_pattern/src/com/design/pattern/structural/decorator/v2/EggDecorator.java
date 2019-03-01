package com.design.pattern.structural.decorator.v2;

public class EggDecorator extends AbstractDescorator {

	public EggDecorator(ABattercake aBattercake) {
		super(aBattercake);
	}

	@Override
	protected String getDesc() {
		return super.getDesc() + "��һ������";
	}

	@Override
	protected int cost() {
		return super.cost() + 1;
	}

	//����Ҫ�ڼӼ��Ĺ����м�ʲô����
	@Override
	public void doSomething() {
		
	}
	
}

