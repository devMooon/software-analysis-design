package ch05.practice3;

public class Singleton {
	private static Singleton singleton = null;

	private Singleton() {
		System.out.println("인스턴스를 생성했습니다.");
	}

	//다중 스레드 환경에서 다른 객체가 만들어질 수 있어서
	//synchronized 키워드를 붙인다.
	synchronized public static Singleton getInstance() {
	//public static Singleton getInstance() {
		// 객체가 생성되지 않았을 경우에만...
		if (singleton == null) {
			singleton = new Singleton();  // 새로 객체를 만든다.
		}
		return singleton;
	}
}
