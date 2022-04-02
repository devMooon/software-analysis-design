package hw.ch10;

import java.util.Date;

public class SortAndPrint {
	// Comparable: ũ�� �� ������ Ŭ�������� �����ϴ� �������̽�
	//             String Ŭ������ �� �������̽��� ��������.
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
