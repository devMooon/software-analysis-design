package ch10.practice4;

public class SortAndPrint {
	// Comparable: ũ�� �� ������ Ŭ�������� �����ϴ� �������̽�
	//             String Ŭ������ �� �������̽��� ��������.
    Comparable[] data;
    Sorter sorter;
    
    public SortAndPrint(Comparable[] data, Sorter sorter) {
        this.data = data;
        this.sorter = sorter;
    }
    public void execute() {
        print();
        sorter.sort(data);
        print();
    }
    public void print() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ", ");
        }
        System.out.println("");
    }
    
    public void setData(Comparable[] data) {
    	this.data = data;
    }
    public void setSorter(Sorter sorter) {
    	this.sorter = sorter;
    }
}
