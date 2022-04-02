package ch10.practice4;

public class InsertSorter implements Sorter {

	@Override
	public void sort(Comparable[] data) {
		// TODO Auto-generated method stub
		Comparable com;
		
		for(int i = 0; i < data.length - 1; i++) {
			
			for(int k = i + 1; k < data.length; k++) {
				if(data[i].compareTo(data[k]) > 0) {
					com = data[k];
					data[k]= data[i];
					data[i] = com;
				}
			}
		}
	}

}
