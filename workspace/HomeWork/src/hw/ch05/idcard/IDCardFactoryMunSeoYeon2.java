package hw.ch05.idcard;

import java.util.Vector;

import hw.ch05.framework.Factory;
import hw.ch05.framework.Product;

public class IDCardFactoryMunSeoYeon2 extends Factory {
	private static IDCardFactoryMunSeoYeon2 idCardFactoryMunSeoYeon2 = null;
	private Vector idCards = new Vector();
	private int serialNum = 100;
	
	private IDCardFactoryMunSeoYeon2() {
		slowDown();
	}
	
	//public static IDCardFactoryMunSeoYeon2 getInstance() {
	synchronized public static IDCardFactoryMunSeoYeon2 getInstance() {
		if(idCardFactoryMunSeoYeon2 == null) {
			idCardFactoryMunSeoYeon2 = new IDCardFactoryMunSeoYeon2();
		}
		return idCardFactoryMunSeoYeon2;
	}
	
	private void slowDown(){
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Product createProduct(String model) {
		return new IDCard(serialNum++);
	}

	@Override
	public void registerProduct(Product product) {
		idCards.add(product);
	}
}
