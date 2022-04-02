package hw.ch10;

import java.util.Date;

public class SortAndPrint {
	// Comparable: 크기 비교 가능한 클래스들이 구현하는 인터페이스
	//             String 클래스도 이 인터페이스를 구현했음.
    Comparable[] data;
    Sorter sorter;
    
    private Date startTime;
    private Date stopTime;
    private long executionTime;
    
    public SortAndPrint(Comparable[] data, Sorter sorter) {
        this.data = data;
        this.sorter = sorter;
    }
    public void execute() {
        print();
        startTime = new Date(System.nanoTime());
        sorter.sort(data);
        stopTime = new Date(System.nanoTime());
		executionTime = stopTime.getTime() - startTime.getTime();
        print();
    }
    public void print() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\n");
           //System.out.print(data[i] + "");
        }
        System.out.println("");
    }
    
    public void setting(Comparable[] data, Sorter sorter) {
    	this.data = data;
    	this.sorter = sorter;
    }
    public Long getExecutionTime() {
    	return executionTime;
    }
}
