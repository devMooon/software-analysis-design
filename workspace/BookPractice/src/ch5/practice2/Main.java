package ch5.practice2;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		for(int i = 0; i < 9; i++) {
			Triple triple = Triple.getInstanceID(i % 3); //0, 1, 2
			System.out.println(i + " : " + triple);
		}
		System.out.println("End");
	}

}
