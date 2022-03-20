package hw.ch04.framework;

import hw.ch04.exception.FactoryMethodRuntimeException;

public class Factory{
	public final Product create(String model) {//������: template method
		Product product = createProduct(model);
		registerProduct(product);
		
		return product;
	}
	//������: 1. �߻� �޼ҵ� ���
	/*public abstract Product createProduct(String model);
	public abstract void registerProduct(Product product);*/
	
	//������: 2. default ���� �غ� /Product�� �߻�Ŭ�����̸� �ȵ�
	/*public Product createProduct(String model) {
		return new Product(model);
	}
	public void registerProduct(Product product) {
		
	}*/
	
	//������: 3. ����ó��
	public Product createProduct(String model)  throws FactoryMethodRuntimeException {
		throw new FactoryMethodRuntimeException();
	}
	public void registerProduct(Product product)  throws FactoryMethodRuntimeException {
		throw new FactoryMethodRuntimeException();
	}
}
