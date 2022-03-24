package hw.ch05.framework;

public abstract class Factory {
	public final Product create(String model) {
		Product product = createProduct(model);
		registerProduct(product);
		
		return product;
	}

	public abstract Product createProduct(String model);
	public abstract void registerProduct(Product product);
}
