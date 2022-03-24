package hw.ch05;

public class Main2 extends Thread {
	private String name;
	
	public Main2(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		Main2 choi = new Main2("ÃÖ½ÂÈÆ");
		Main2 mun = new Main2("¹®¼­¿¬");
		Main2 pack = new Main2("¹Ú¼Ò¿¬");
		
	}

}
