package ch05.practice1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketMaker ticketMaker = TicketMaker.getTicketMaker();
		
		for(int i = 0; i < 10; i++) {
			System.out.println(ticketMaker.getNextTicketNumber());
		}
		
		TicketMaker ticketMaker2 = TicketMaker.getTicketMaker();
		System.out.println("¸¶Áö¸·: " + ticketMaker2.getNextTicketNumber());
	}

}
