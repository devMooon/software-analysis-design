package hw.ch10;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] data = {
				new Student("������", "20200675", 153),
				new Student("������", "20200818", 159),
				new Student("������", "20200733", 151),
				new Student("������", "20200709", 158),
				new Student("�ӿ���", "20200694", 162)
		};
		Student[] data2 = {
				new Student("������", "20200675", 153),
				new Student("������", "20200818", 159),
				new Student("������", "20200733", 151),
				new Student("������", "20200709", 158),
				new Student("�ӿ���", "20200694", 162)
		};
		
		
		System.out.println("20200675 ������");
		System.out.println("<���� ���>");
		System.out.println("(1) by InsertSorter -----------------------------");
		SortAndPrint sap = new SortAndPrint(data, new InsertSorter());
		sap.execute();
        System.out.println("* execution time: " + sap.getExecutionTime() + "(miliseconds)\n");
        
		System.out.println("(2) by BubbleSorter ---------------------------");
		sap.setting(data2, new BubbleSorter());
		sap.execute();
		System.out.println("* execution time: " + sap.getExecutionTime() + "(miliseconds)\n");
		
		
	}

}
