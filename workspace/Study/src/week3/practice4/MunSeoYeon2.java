package week3.practice4;

public class MunSeoYeon2 {
	private static MunSeoYeon2 munSeoYeon = new MunSeoYeon2();
	
	private MunSeoYeon2() {
		
	}
	
	//���� ������ ȯ�濡���� Okay
	public static MunSeoYeon2 getInstance() {
		return munSeoYeon;
	}
}
