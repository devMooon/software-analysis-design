package week3.practice3.Cookie;

import week3.practice3.Framework.Product;

public class Cookie extends Product {
	public Cookie(String name) {
		super(name);
	}
	public String getCookieName(){
		return name + "��Ű";
	}
	@Override
	public void sale() {
		// TODO Auto-generated method stub
		System.out.println(name + " ��Ű�� �Ǹ��մϴ�.");
	}
}
