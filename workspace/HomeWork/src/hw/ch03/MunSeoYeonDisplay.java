package hw.ch03;

public class MunSeoYeonDisplay extends AbstractDisplay {
	private String name;
	private String studentId;
	private int grade;
	
	public MunSeoYeonDisplay(String name, String studentId, int grade) {
		this.name = name;
		this.studentId = studentId;
		this.grade = grade;
	}
	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("===================");
		System.out.println("�������ڴ��б� ��ǻ�Ͱ��а�");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("�й� " + studentId + " / " + grade + "�г� / " + name);
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("���ø� �޼ҵ� ���� �����Դϴ�.");
		System.out.println("===================");
	}

}
