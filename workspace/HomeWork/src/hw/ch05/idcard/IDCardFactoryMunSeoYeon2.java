package hw.ch05.idcard;

import hw.ch05.framework.Factory;

public class IDCardFactoryMunSeoYeon2 extends Factory {
	private static IDCardFactoryMunSeoYeon2 idCardFactoryMunSeoYeon2 = new IDCardFactoryMunSeoYeon2();
	private IDCardFactoryMunSeoYeon2() {
		
	}
	
	synchronized public IDCardFactoryMunSeoYeon2 getInstance() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return idCardFactoryMunSeoYeon2;
	}
}
