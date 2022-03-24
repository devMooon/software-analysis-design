package hw.ch05.idcard;

import java.util.Vector;

import hw.ch05.framework.Factory;
import hw.ch05.framework.Product;

public class IDCardFactoryMunSeoYeon1 extends Factory {
	private static IDCardFactoryMunSeoYeon1 idCardFactoryMunSeoYeon1 = new IDCardFactoryMunSeoYeon1();
	private Vector idCards = new Vector();
	private int serialNum = 100;
	
	private IDCardFactoryMunSeoYeon1() {
		
	}
	
	public static IDCardFactoryMunSeoYeon1 getInstance() {
		return idCardFactoryMunSeoYeon1;
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
