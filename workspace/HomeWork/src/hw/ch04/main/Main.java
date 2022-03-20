package hw.ch04.main;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;
import hw.ch04.tv.TVFactory;

public class Main {

	public static void main(String[] args) {
		System.out.println("20200675 ¹®¼­¿¬");
		
		Factory tvFactory = new TVFactory();
		
		Product p1 = tvFactory.create("20200675");
		Product p2 = tvFactory.create("111");
		Product p3 = tvFactory.create("222");
		Product p4 = tvFactory.create("333");
		
		p1.use();
		p2.use();
		p3.use();
		p4.use();
		
		System.out.println();
		
		((TVFactory)tvFactory).printAllModelNumbers();
	}

}
