package week3.practice3.Chocolate;

import week3.practice3.Framework.Product;

public class Chocolate extends Product {
	public Chocolate(String name) {
		super(name);
	}
	public String getChocolateName(){
		return name + "���ݸ�";
	}
	@Override
	public void sale() {
		// TODO Auto-generated method stub
		System.out.println(name + " ��Ű�� �Ǹ��մϴ�.");
	}
	
}
