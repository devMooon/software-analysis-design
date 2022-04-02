package ch10.practice4;

public class BubbleSorter implements Sorter {

	@Override
	public void sort(Comparable[] data) {
		// TODO Auto-generated method stub
		Comparable com;
		int num;
		
		for(int i = 0; i < data.length; i++) {
			
			for(int k = i + 1; k < data.length; k++) {
				num = i;
				if(data[i].compareTo(data[k]) > 0) {
					com = data[k];
					data[k]= data[i];
					data[i] = com;
				}
				num++;
			}
		}
	}
}