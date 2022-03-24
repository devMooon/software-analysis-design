package ch5.practice2;

public class Triple {
	private static Triple triple0 = new Triple();
	private static Triple triple1 = new Triple();
	private static Triple triple2 = new Triple();
	private static Triple[] triples = {triple0, triple1, triple2};
	
	//private static Triple[] triples = new Triple[3];
	
	private Triple() {
		/*for(int i = 0; i < 3; i++) {
			triples[i] = new Triple();
		}*/
		System.out.println("Triple »ý¼º");
	}
	public static Triple getInstanceID(int id){
		return triples[id];
	}
}
