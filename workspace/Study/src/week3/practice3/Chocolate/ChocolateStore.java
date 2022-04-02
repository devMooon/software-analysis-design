package week3.practice3.Chocolate;

import java.util.Vector;

import week3.practice3.Exception.NotCreateException;
import week3.practice3.Framework.Product;
import week3.practice3.Framework.Store;

public class ChocolateStore extends Store {
	public Vector chocolates = new Vector();
	
	public Vector getChocolates() {
		return chocolates;
	}
	
	@Override
	public Product createProduct(String name) throws NotCreateException {
		// TODO Auto-generated method stub
		System.out.println(name + " ���ݸ��� ����ϴ�.");
		return new Chocolate(name);
	}
	
	@Override
	public void packingProduct(Product product) {
		// TODO Auto-generated method stub
		System.out.println(product.name + " ���ݸ��� �����մϴ�.");
		chocolates.add(product);
	}
}
