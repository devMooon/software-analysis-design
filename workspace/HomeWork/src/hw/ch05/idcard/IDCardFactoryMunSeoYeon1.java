package hw.ch05.idcard;

import hw.ch05.framework.Factory;

public class IDCardFactoryMunSeoYeon1 extends Factory {
	private static IDCardFactoryMunSeoYeon1 idCardFactoryMunSeoYeon1 = new IDCardFactoryMunSeoYeon1();
	private IDCardFactoryMunSeoYeon1() {
		
	}
	
	public static IDCardFactoryMunSeoYeon1 getInstance() {
		return idCardFactoryMunSeoYeon1;
	}
}
