package hw.ch04.tv;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("20200675 ¹®¼­¿¬");
		
		Factory tvFactory = new TVFactory();
		Product p1 = tvFactory.createProduct("20200675");
		Product p2 = tvFactory.createProduct("111");
		Product p3 = tvFactory.createProduct("222");
		Product p4 = tvFactory.createProduct("333");
		
		p1.use();
		p2.use();
		p3.use();
		p4.use();
		
		System.out.println();
		
		tvFactory.registerProduct(p1);
		tvFactory.registerProduct(p2);
		tvFactory.registerProduct(p3);
		tvFactory.registerProduct(p4);
		
		((TVFactory)tvFactory).printAllModelNumbers();
	}

}
