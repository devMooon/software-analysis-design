package hw.ch05;

import hw.ch05.idcard.IDCardFactoryMunSeoYeon2;

public class Main2 extends Thread {

	public Main2(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		System.out.println(getName() + ": " + IDCardFactoryMunSeoYeon2.getInstance());
	}
	
	public static void main(String[] args) {
		System.out.println("20200675 문서연");
		new Main2("최승훈").start();
		new Main2("문서연").start();
		new Main2("박소연").start();
	}
}
