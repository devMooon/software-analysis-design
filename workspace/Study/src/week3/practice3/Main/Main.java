package week3.practice3.Main;

import java.util.Iterator;
import java.util.Vector;

import week3.practice3.Chocolate.Chocolate;
import week3.practice3.Chocolate.ChocolateStore;
import week3.practice3.Cookie.Cookie;
import week3.practice3.Cookie.CookieStore;
import week3.practice3.Exception.NotCreateException;
import week3.practice3.Framework.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Store�� �����!!!!!!
		CookieStore cookieStore = new CookieStore();
		

		cookieStore.create("���ݸ�");
		cookieStore.create("����");
		
		Vector cookies = cookieStore.getCookies();
		Iterator iterator = cookies.iterator();
		
		while(iterator.hasNext()) {
			//? ĳ����
			//System.out.println(iterator.next().getClass().getName());
			Cookie cookie = (Cookie) iterator.next();
		}
		
		iterator = cookies.iterator();
		while(iterator.hasNext()) {
			//? ĳ����
			Product product = ((Product) iterator.next());
			System.out.println(((Cookie)product).getCookieName());
		}

		
		
		
		
		System.out.println();
		
		
		
		
		ChocolateStore chocolateStore = new ChocolateStore();
		
		//?���� ó��
		try {
			chocolateStore.create("��ũ");
			chocolateStore.create("ȭ��Ʈ");
			
			Vector chocolates = chocolateStore.getChocolates();
			Iterator iterator1 = chocolates.iterator();
			
			while(iterator1.hasNext()) {
				//? ĳ����
				Product product = ((Product) iterator1.next());
				product.sale();
			}
			
			iterator1 = chocolates.iterator();
			while(iterator1.hasNext()) {
				//? ĳ����
				Product product = ((Product) iterator1.next());
				System.out.println(((Chocolate)product).getChocolateName());
			}
		} catch (NotCreateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
