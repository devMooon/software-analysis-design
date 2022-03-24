package ch5.practice2;

public class Triple {
	/*
	 * private static Triple triple0 = new Triple();
	private static Triple triple1 = new Triple();
	private static Triple triple2 = new Triple();
	private static Triple[] triples = {triple0, triple1, triple2};
	*/
	//private static Triple[] triples = new Triple[3];
	
	private static Triple[] triples = new Triple[] {
			new Triple(0),
			new Triple(1),
			new Triple(2)
	};
	private int id;
	private Triple(int id) {
		/*for(int i = 0; i < 3; i++) {
			triples[i] = new Triple();
		}*/
		System.out.println("The instance " + id + " is created.");
		this.id = id;
		
	}
	public static Triple getInstanceID(int id){
		return triples[id];
	}
	public String toString() {
		return "[Triple id = " + id + "]";
	}
}
