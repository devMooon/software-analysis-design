package week3.practice1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFormA myFormA = new MyFormA("�������ڴ��б�", "20200675", "������");
		MyFormB myFormB = new MyFormB("�������ڴ��б�", "20200675", "������");
		
		System.out.println("A");
		myFormA.printModeA();
		myFormA.printModeB();
		myFormA.printModeC();
		
		System.out.println("--------------------------------------------------");
		System.out.println("B");
		myFormB.printModeA();
		myFormB.printModeB();
		myFormB.printModeC();
		
	}

}
