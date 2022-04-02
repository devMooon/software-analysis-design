package week3.practice3.Framework;

import week3.practice3.Exception.NotCreateException;

public abstract class Store {
	//??? 예외처리
	public Product createProduct(String name) throws NotCreateException { //예외처리, Factory Method
		throw new NotCreateException();
	}
	
	public abstract void packingProduct(Product product);
	
	//final로 선언!!!!!!
	public Product create(String name) {//템플릿 메소드7
		Product product = createProduct(name);
		packingProduct(product);

		return product;
	}
}
