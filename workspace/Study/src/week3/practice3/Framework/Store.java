package week3.practice3.Framework;

import week3.practice3.Exception.NotCreateException;

public abstract class Store {
	//??? ����ó��
	public Product createProduct(String name) throws NotCreateException { //����ó��, Factory Method
		throw new NotCreateException();
	}
	
	public abstract void packingProduct(Product product);
	
	//final�� ����!!!!!!
	public Product create(String name) {//���ø� �޼ҵ�7
		Product product = createProduct(name);
		packingProduct(product);

		return product;
	}
}
