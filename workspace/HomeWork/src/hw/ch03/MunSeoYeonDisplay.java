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
		System.out.println("덕성여자대학교 컴퓨터공학과");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("학번 " + studentId + " / " + grade + "학년 / " + name);
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("템플릿 메소드 패턴 숙제입니다.");
		System.out.println("===================");
	}

}
