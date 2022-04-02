package week3.practice4.main;

import week3.practice4.MunSeoYeon1;

public class Main1 extends Thread {
	public String name;
	public Main1(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		MunSeoYeon1 mun = MunSeoYeon1.getInstance();

		System.out.println(name + mun);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main1 main;
		
		for(int i = 0; i < 3; i++) {
			main = new Main1("MunSeoYeon" + (i+1));
			main.start();
		}
	}
	
	

}
