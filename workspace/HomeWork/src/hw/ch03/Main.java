package hw.ch03;

public class Main {
	public static void main(String[] args) {
		System.out.println("20200675 문서연");
		AbstractDisplay mun = new MunSeoYeonDisplay("문서연", "20200675", 3);
		mun.display(10);
	}
}
