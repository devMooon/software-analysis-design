package ch05.practice1;

public class TicketMaker {
	private static TicketMaker ticketMaker = new TicketMaker();
	private int ticket = 1000;
	private TicketMaker() {
		System.out.println("Ticket Maker Create");
	}
	public static TicketMaker getTicketMaker() {
		return ticketMaker;
	}
	public int getNextTicketNumber() {
		return ticket++;
	}
}
