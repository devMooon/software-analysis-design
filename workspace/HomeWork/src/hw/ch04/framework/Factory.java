package hw.ch04.framework;

import hw.ch04.exception.FactoryMethodRuntimeException;

public class Factory{
	public final Product create(String model) {//문서연: template method
		Product product = createProduct(model);
		registerProduct(product);
		
		return product;
	}
	//문서연: 1. 추상 메소드 사용
	/*public abstract Product createProduct(String model);
	public abstract void registerProduct(Product product);*/
	
	//문서연: 2. default 구현 준비 /Product는 추상클래스이면 안됨
	/*public Product createProduct(String model) {
		return new Product(model);
	}
	public void registerProduct(Product product) {
		
	}*/
	
	//문서연: 3. 예외처리
	public Product createProduct(String model)  throws FactoryMethodRuntimeException {
		throw new FactoryMethodRuntimeException();
	}
	public void registerProduct(Product product)  throws FactoryMethodRuntimeException {
		throw new FactoryMethodRuntimeException();
	}
}
