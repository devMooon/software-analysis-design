package week3.practice3.Chocolate;

import week3.practice3.Framework.Product;

public class Chocolate extends Product {
	public Chocolate(String name) {
		super(name);
	}
	public String getChocolateName(){
		return name + "초콜릿";
	}
	@Override
	public void sale() {
		// TODO Auto-generated method stub
		System.out.println(name + " 쿠키를 판매합니다.");
	}
	
}
