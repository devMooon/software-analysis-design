package ch5.plus;

public class Main {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		Car mySonata= (Car)(factory.createCar());
		Car yourSonata = (Car)(factory.createCar());
		Car ourSonata = (Car)(factory.createCar());
		System.out.println(mySonata.getNum());
		System.out.println(yourSonata.getNum());
		System.out.println(ourSonata.getNum());
	}

}
