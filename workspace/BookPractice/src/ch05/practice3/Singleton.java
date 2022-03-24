package ch05.practice3;

public class Singleton {
	private static Singleton singleton = null;

	private Singleton() {
		System.out.println("�ν��Ͻ��� �����߽��ϴ�.");
	}

	//���� ������ ȯ�濡�� �ٸ� ��ü�� ������� �� �־
	//synchronized Ű���带 ���δ�.
	synchronized public static Singleton getInstance() {
	//public static Singleton getInstance() {
		// ��ü�� �������� �ʾ��� ��쿡��...
		if (singleton == null) {
			singleton = new Singleton();  // ���� ��ü�� �����.
		}
		return singleton;
	}
}
