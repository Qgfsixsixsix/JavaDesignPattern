package com.design.pattern.structural.adapter.life;

/**
 * ������
 * @author Qgfzzzzzz
 * @date 2018-12-9
 * @version 1.0.0
 * The package is com.design.pattern.structural.adapter.life
 */
public class PowerAdapter implements DC5 {

	private AC220 ac220 = new AC220();
	
	public int outputDC5V() {
		int adapterInput = ac220.outputAC220V();
		
		//��ѹ��...
		int adapterOutput = adapterInput / 44;
		System.out.println("ʹ��PowerAdapter����AC��" + adapterInput + "���DC��" + adapterOutput);
		return adapterOutput;
	}

}
