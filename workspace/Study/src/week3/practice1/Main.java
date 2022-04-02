package week3.practice1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFormA myFormA = new MyFormA("덕성여자대학교", "20200675", "문서연");
		MyFormB myFormB = new MyFormB("덕성여자대학교", "20200675", "문서연");
		
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
