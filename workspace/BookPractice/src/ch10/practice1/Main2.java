package ch10.practice1;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Hand h1 = new Hand(Hand.HANDVALUE_GUU); // �ָ�
		Hand h2 = new Hand(Hand.HANDVALUE_PAA); // ��
		
		if(h1.isWeakerThan(h2)) {
			System.out.println("h1�� ����.");
		}
		
		System.out.println(h1.toString());
		System.out.println(h2t);*/
		
		Player player1 = new  Player("������", new ProbStrategy(100));
		Player player2 = new  Player("���缮", new WinningStrategy(200));
		
		for(int i = 0; i < 10000; i++) {
			Hand hand1 = player1.nextHand();
			Hand hand2 = player2.nextHand();
			
			if(i==5000) {
				player1.setStrategy(new WinningStrategy(200));
			}
			if(hand1.isStrongerThan(hand2)) {
				System.out.println("Winner: " + player1);
				player1.win();
				player2.lose();
			}
			else if(hand2.isStrongerThan(hand1)) {
				System.out.println("Winner: " + player2);
				player2.win();
				player1.lose();
			}
			else {
				System.out.println("Even.");
				player1.even();
				player2.even();
			}
		}
		
		System.out.println("Total result");
		System.out.println(" " + player1); //player1.toString() �ڵ����� ȣ���
		System.out.println(player2); //player1.toString() �ڵ����� ȣ���
	}

}
