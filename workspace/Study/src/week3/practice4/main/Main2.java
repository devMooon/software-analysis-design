package week3.practice4.main;

import week3.practice4.MunSeoYeon2;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MunSeoYeon2 mun1 = MunSeoYeon2.getInstance();
		MunSeoYeon2 mun2 = MunSeoYeon2.getInstance();
		
		System.out.print("obj1�� obj2�� ���� ");
		if(mun1 == mun2) {
			System.out.println("����.");
		}
		else {
			System.out.println("�ٸ���.");
		}
		
		System.out.println("obj1: " + mun1);
		System.out.println("obj1: " + mun2);
	}

}
