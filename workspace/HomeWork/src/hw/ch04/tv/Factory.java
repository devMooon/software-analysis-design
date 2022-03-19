package hw.ch04.tv;

public abstract class Factory {
	public abstract Product createProduct(String model);
	public abstract void registerProduct(Product product);
}
