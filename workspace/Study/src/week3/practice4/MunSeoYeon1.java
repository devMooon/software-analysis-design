package week3.practice4;

public class MunSeoYeon1 {
	private static MunSeoYeon1 munSeoYeon = null;
	
	private MunSeoYeon1() {
		
	}
	
	//다중 스레드 환경에서도 Okay
	synchronized public static MunSeoYeon1 getInstance() {
		if(munSeoYeon == null) {
			munSeoYeon = new MunSeoYeon1();
		}
		
		return munSeoYeon;
	}
}
