package hw.ch10;

import java.util.Date;

public class BubbleSorter implements Sorter {
	
	@Override
	public void sort(Comparable[] data) {
		// TODO Auto-generated method stub
		Comparable com;
		
		for(int i = 0; i < data.length-1; i++) {
			for(int k = 0; k < data.length - 1 - i; k++) {
				if(data[k].compareTo(data[k+1]) < 0) {
					com = data[k];
					data[k]= data[k+1];
					data[k+1] = com;
				}
			}
			
		}
    }
}