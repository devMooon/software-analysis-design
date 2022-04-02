package week3.practice3.Framework;

public abstract class Product {
	public String name;
	public Product(String name) {
		this.name = name;
	}
	public abstract void sale();
}
