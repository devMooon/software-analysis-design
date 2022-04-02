package week3.practice3.Cookie;

import java.util.Vector;

import week3.practice3.Exception.NotCreateException;
import week3.practice3.Framework.Product;
import week3.practice3.Framework.Store;

public class CookieStore extends Store {
	public Vector cookies = new Vector();
	
	public Vector getCookies() {
		return cookies;
	}
	
	@Override
	public Product createProduct(String name) throws NotCreateException {
		// TODO Auto-generated method stub
		System.out.println(name + " ��Ű�� ����ϴ�.");
		return new Cookie(name);
	}
	
	@Override
	public void packingProduct(Product product) {
		// TODO Auto-generated method stub
		System.out.println(product.name + " ��Ű�� �����մϴ�.");
		cookies.add(product);
	}
}
