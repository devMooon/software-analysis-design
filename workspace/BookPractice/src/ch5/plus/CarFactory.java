package ch5.plus;

public class CarFactory extends Factory{
	private static CarFactory carFactory = new CarFactory();
	private int serial = 10000;
	
	private CarFactory() {
		System.out.println("�ڵ��� ���� ����");
	}
	
	public static CarFactory getInstance() {
		return carFactory;
	}
	
	public Product createCar() {
		return new Car(serial++);
	}
}
