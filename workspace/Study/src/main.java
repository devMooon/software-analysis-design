
public class main {

	//성민 언니 10장 과제
	public static void main(String[] args) {
		Integer[] data = new Integer[4];
		data[0] = 10;
		data[1] = 20;
		data[2] = 15;
		data[3] = 25;
		
		for(int i = 0; i < data.length-1; i++) {
	         for(int j = 0; j < data.length-1-i; j++) {
	            if(data[j] > data[j+1]) {
	               int tmp = data[j]; 
	               data[j] = data[j+1]; 
	               data[j+1] = tmp; 
	            }
	         }
	      }

		for(int i =0; i < data.length; i++) {
			System.out.println(data[i]+ ", " );
		}
	}

}
